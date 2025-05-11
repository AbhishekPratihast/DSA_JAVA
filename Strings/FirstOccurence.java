package Strings;
import java.util.Scanner;
class FirstOccurence{
    public static int firstOcc(String haystack, String needle) {
        char ch=needle.charAt(0);
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==ch){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Haystack:");
        String haystack=sc.next();
        System.out.print("enter Needle:");
        String needle=sc.next();
        int ans=firstOcc(haystack,needle);
        System.out.println(ans);
    }
}