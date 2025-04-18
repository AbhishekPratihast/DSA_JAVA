public class TrapRainWater {
    public static int trappedwater(int arr[]){
        int n=(arr.length);
        int waterlevel=0;
        //create leftmax arr
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        //create rightmax arr
        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        //Loop
        int trapwater=0;
        for(int i=0;i<n;i++){
            waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapwater+=waterlevel-arr[i];
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println("Trapped water: "+trappedwater(height));
    }
}
