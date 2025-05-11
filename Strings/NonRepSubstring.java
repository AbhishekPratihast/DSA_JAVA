package Strings;
import java.util.*;
//Program to fint longest Substring without repetetion of char in it
public class NonRepSubstring{
    public static int LNRSs(String s){
        int start=0;
        int end=0;
        int max_len=0;
        List<Character> Lst=new ArrayList<Character>();
        while(end<s.length()){
            if(!Lst.contains(s.charAt(end))){
                Lst.add(s.charAt(end));
                end++;
                max_len=Math.max(max_len,Lst.size());
                }
            else{
                Lst.remove((Character) s.charAt(start));
                start++;
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sc.nextLine();
        System.out.println(LNRSs(s));//Longest non repeting Substring
    }
}