public class PairsinArray {
    public static void pairsinarr(int arr[]){
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={4,3,2,6,9,8};
        pairsinarr(numbers);
    }   
}