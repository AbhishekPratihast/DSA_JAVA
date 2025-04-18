import java.util.Scanner;

public class bhbvn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("enter next element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing...");
        for(int j:arr){
            System.out.print(arr[j]);
        }
    }
    
}