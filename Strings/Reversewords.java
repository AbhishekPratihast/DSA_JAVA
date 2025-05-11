package Strings;

import java.util.Scanner;

public class Reversewords {
    public static String reversewords(String s) {
        String[] words=s.trim().split("\\s+"); //s.split(" +")->means split by any no of spaces
        String temp="";
        StringBuilder ans=new StringBuilder("");
        for(int i=words.length-1;i>=0;i--){
            temp=words[i].trim();
            ans.append(temp).append(" ");
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reversewords(s)) ;
    }
}
