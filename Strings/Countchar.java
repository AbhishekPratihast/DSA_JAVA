package Strings;

import java.util.Scanner;
//Program for count no.of char in a String
public class Countchar {
    public static int countChar(String s){
        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
            }
            else{
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        System.out.println(countChar(s));
    }
}
