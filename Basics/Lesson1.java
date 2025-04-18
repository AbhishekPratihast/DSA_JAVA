package Basics;
import java.util.*;
public class Lesson1 {
    public static void main(String[] args){
        //output in program
        System.out.print("Hello World");
        System.out.println("bro whats up\nwhat are you doing\nwhats your plan today");
        //taking input from user
        Scanner sc=new Scanner(System.in);
        //for one word
        String name=sc.next();
        System.out.println(name);
        //for multiple words
        String message=sc.nextLine();
        System.out.println(message);
        //for integer input
        int age=sc.nextInt();
        System.out.println(age);
        //for float input
        float salary=sc.nextFloat();
        System.out.println(salary);
        //for array input
        int[] numbers=new int[5];
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
