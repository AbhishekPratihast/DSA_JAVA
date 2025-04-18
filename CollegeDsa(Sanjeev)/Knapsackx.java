import java.util.*;
public class Knapsack{
public static void main(String args[]){
    int im[][]=new int [10][2];
    int km[][]=new int[10][10];
    int i,j, w=0,W,profit=0;
    int A,B;
    System.out.println("Enter the no. of values: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("\nEnter the no. of Knapsack: ");
    W=sc.nextInt();
    System.out.println("\nEnter the weight and values: ");
for(i=0; i<n;i++){
    im[i][0]=sc.nextInt();
    im[i][1]=sc.nextInt();
} 
//KnapMatrix
for(i=0;i<n;i++){
    for(j=0;j<=W;j++){
        if(i==0&&j>=0){
           km[i][j]=0;}
        else if(i>=0&&j==0){
            km[i][j]=0;}
        else if((j-im[i-1][0])<0){
              km[i][j]=km[i-1][j];}
        else if((j-im[i-1][0])>=0){
               A=km[i-1][j];
               B=im[i-1][1]+km[i-1][(j-im[i-1][0])];
            if(A>B)
              im[i][0]=sc.nextInt();
              im[i][1]=sc.nextInt();
        }
    }
}
//KnapMatrix
for(i=0;i<n;i++){
    for(j=0;j<=W;j++){
    if(i==0&&j>=0)
   km[i][j]=0;
   else if(i>=0&&j==0)
   km[i][j]=0;
   else if((j-im[i-1][0])<0)
   km[i][j]=km[i-1][j];
   else if((j-im[i-1][0])>=0){ 
   A=km[i-1][j];
   B=im[i-1][1]+km[i-1][(j-im[i-1][0])];
   if(A>B)
  km[i][j]=A;
  else
  km[i][j]=B;
  }
 }
}
 for(i=0;i<n;i++){
    for(j=0;j<W;j++){
        System.out.print("" + km[i][j]);}
    System.out.println();
    }
}
}
