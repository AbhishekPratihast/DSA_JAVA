import java.util.Scanner;
public class Lesson5 {
    public static void printfun(int n){
        for(int i=0;i<n;i++){
            System.out.println("Hello worlld");
        }
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many times you want to print Hello world");
        int x=sc.nextInt();
        printfun(x);
    }
}
