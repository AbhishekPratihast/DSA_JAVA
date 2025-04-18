public class Seclargest {
        public static int getSecondLargest(int[] arr) {
            int largest=arr[0],secondlar=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]>arr[i-1]){
                    secondlar=largest;
                    largest=arr[i];
                }
                else if(largest>arr[i] && secondlar<arr[i]){
                    secondlar=arr[i];
                }
            }
            if(largest==secondlar){
                return -1;
            }
            else{
                return secondlar;
            }
        }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,5,2,4,9,1};
        System.out.println(getSecondLargest(arr));
    }
}

