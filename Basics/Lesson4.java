package Basics;
import java.util.*;
public class Lesson4 {
    public static void main(String[] args){
        /*Question->Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
        If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
        If they enter 0 then stop.
        If he/ she scores :
        Marks >=90 -> print “This is Good”
        89 >= Marks >= 60 -> print “This is also Good”
        59 >= Marks >= 0 -> print “This is Good as well”
            Because marks don’t matter but our effort does.
        (Hint : use do-while loop but think & understand why)*/
        Scanner sc=new Scanner(System.in);
    //Answer
        /*int x=0;
        do {
            System.out.println("enter 1 if you want to enter student marks and enter 0 if you want to exit");
            int n=sc.nextInt();
            if (n==1){
                System.out.println("Enter marks:");
                int m=sc.nextInt();
                if (m>=90){
                    System.out.println("This is Good");
                }
                else if(m>=60&&m<=89){
                    System.out.println("This is also good");
                }
                else if(m>=0&&m<=59){
                    System.out.println("This is good as well");
                }
                else {
                    System.out.println("Invalid Marks");
                }
            }
            else {
                x=1;
                break;
            }
        } while (x==0);*/
    //Prime numbers
        /*int n=sc.nextInt();
        for(int i=2; i<=n; i++){
            if (n%i==0){
                if(i!=n){
                    System.out.print(n + " not prime ");
                }
                else {
                    System.out.print(n + " is prime ");
                }
                break;
            }
        }*/
    }
}
