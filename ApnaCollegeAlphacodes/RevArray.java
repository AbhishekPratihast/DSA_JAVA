public class RevArray {
    public static int[] revarr(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int numbers[]={4,2,1,5,8,6,9};
        revarr(numbers);
        //print rev arr
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
