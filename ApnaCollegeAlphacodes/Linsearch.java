public class Linsearch {
    public static int linsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={4,6,3,7,1,9};
        int key=7;
        int ans=linsearch(numbers,key);
        if(ans==-1){
            System.out.print("Key not found");
        }
        else{
            System.out.println("Key found at index: "+ans);
        }
    }
}
