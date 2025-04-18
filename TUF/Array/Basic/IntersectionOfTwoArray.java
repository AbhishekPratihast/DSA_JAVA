import java.util.*;
// Optimal--> using two pointer
/* public class IntersectionOfTwoArray {
   public static int[] arrayIntersection(int[] A,int n,int[] B,int m){
      int i=0,j=0;
      ArrayList<Integer> ans=new ArrayList<>();
      while(i<n && j<m){
         if(A[i]<B[j]){
            i++;
         }
         else if(B[j]<A[i]){
            j++;
         }
         else{
            ans.add(A[i]);
            i++;
            j++;
         }
      }
      int[] answ=new int[ans.size()];
      for(int z=0;z<ans.size();z++){
         answ[z]=ans.get(z);
      }
      return answ;
   }
   public static void main(String[] args){
      int A[]={1,2,2,3,3,4,5,6};
      int B[]={2,3,3,5,6,6,7};
      System.out.println(Arrays.toString(arrayIntersection(A, A.length, B, B.length)));
   }
}*/



public class IntersectionOfTwoArray {
   public static int[] arrayIntersection(int[] A,int n,int[] B,int m){
      ArrayList<Integer> ans=new ArrayList<>();
      int vis[]=new int[m];
      for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
            if(A[i]==B[j] && vis[j]==0){
               ans.add(A[i]);
               vis[j]=1;
               break;
            }
            if(B[j]>A[i]){
               break;
            }
         }
      }
      int answ[]=new int[ans.size()];
      for(int j=0;j<ans.size();j++){
         answ[j]=ans.get(j);
      }
      return answ;
   }
   public static void main(String[] args){
      int A[]={1,2,2,3,3,4,5,6};
      int B[]={2,3,3,5,6,6,7};
      System.out.println(Arrays.toString(arrayIntersection(A, A.length, B, B.length)));
   }
}