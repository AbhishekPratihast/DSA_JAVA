public class LargestInArray {
    public static int largestinarr(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={3,5,6,2,7,8,1,4};
        System.out.println("Largest element is: "+largestinarr(numbers));
    }
}
