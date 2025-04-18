public class MaxSubarrSum {
    // optimized soln Using Prefix Array
    public static void maxSubarrSum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        // first element of prefix array
        prefix[0]=numbers[0];
        //calculate prefic array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        //for start
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                if(start==0){
                    currsum=prefix[end];
                }
                else{
                currsum=prefix[end]-prefix[start-1];
                }
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
            currsum=0;
        }
        System.out.println("max subarray sum:"+maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubarrSum(numbers);
    }
}
