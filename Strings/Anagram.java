package Strings;
import java.util.*;
//To check 2 strings are Anagram (having same freqency of char)
public class Anagram{
    public static boolean isAnagram(String s1,String s2){
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st string: ");
        String s1=sc.next();
        System.out.print("enter 2nd string: ");
        String s2=sc.next();
        System.out.println(isAnagram(s1,s2));
    }
}