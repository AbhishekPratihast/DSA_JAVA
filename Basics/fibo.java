public class fibo {
    private static int F(int x) { //Nth fibonachi number
        int a=0;
        int b=0;
        int c=1;
        for(int i=0;i<x;i++){
            a=b;
            b=c;
            c=a+b;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(F(5));//0 1 1 2 3 5 8 13
    }
}
