package Basics;
import java.util.*;
public class Lesson3i {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*int age=sc.nextInt();
        if (age>18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }*/
        //Program Odd/Even number
        /*int x=sc.nextInt();
        if (x%2==0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }*/
        //Program 
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a==b) {
            System.out.println("Equal");
        }
        else if (a>b) {
            System.out.println("greater");
        }
        else {
            System.err.println("lesser");
        }
    }
}