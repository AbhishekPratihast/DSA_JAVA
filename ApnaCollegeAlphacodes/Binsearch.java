public class Binsearch {
    public static int binsearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (arr[mid]==key) {
                return mid;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9};
        int key=5;
        int ans=binsearch(numbers, key);
        if(ans==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index: "+ans);
        }
    }
}
