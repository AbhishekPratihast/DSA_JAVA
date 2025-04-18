import java.util.Scanner;

public class Fractional {

    public static void main(String[] args) {
        int[] w = new int[10];
        int[] v = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter the weight: ");
            w[i] = sc.nextInt();
            System.out.print("Enter the value: ");
            v[i] = sc.nextInt();
        }

        System.out.print("\nEnter the capacity of the knapsack: ");
        int W = sc.nextInt();

        fractional(n, w, v, W);
    }

    public static void fractional(int n, int[] w, int[] v, int W) {
        double profit = 0;
        double avail = W;

        for (int i = 0; i < n; i++) {
            if (avail > w[i]) {
                profit += v[i];
                avail -= w[i];
            } else {
                double fraction = avail / w[i];
                profit += fraction * v[i];
                break;
            }
        }

        System.out.println("\nThe maximum profit is: " + profit);
    }
}
