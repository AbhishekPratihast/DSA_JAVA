package Basics;
import java.util.*;
public class Patterns {
    public static void main(String[] args){
        int n=4;
        int m=5;
        //Pattern 1
        /*for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //Pattern 2
        /*for(int i=1;i<=n; i++){
            for(int j=1;j<=m; j++){
                if(i==1||j==1||j==m||i==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        //Pattern 3
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //Pattern 4
        /*int x=n;
        for(int i=1;i<=n;i++){
            for(int j=x;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
            x--;
        }*/
        //pattern 4(another)
        /*for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
            System.out.print("*");
            }
            System.out.println();
        }*/
        /*for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        
    }
}
