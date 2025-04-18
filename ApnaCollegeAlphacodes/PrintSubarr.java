import java.util.*;
public class PrintSubarr{
    static int summ=0,maxsum=0;
        public static void printSubarrays(int numbers[]) {
            for(int i=0;i<numbers.length;i++){
                int start=i;
                for(int j=i;j<numbers.length;j++){
                    int end=j;
                    for(int k=start;k<=end;k++){
                        System.out.print(numbers[k]);
                        summ+=numbers[k];
                    }
                System.out.println();
                if(summ>maxsum){
                    maxsum=summ;
                }
                summ=0;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        printSubarrays(numbers);
        System.out.println("Maxsum: "+maxsum);
    }
}
