import java.util.Scanner;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of matrices: ");
        int n = scanner.nextInt();

        int[] p = new int[n + 1];
        System.out.print("Enter the order of matrices: ");
        for (int i = 0; i <= n; i++) {
            p[i] = scanner.nextInt();
        }

        matrixChainMultiplication(p, n);
    }

    public static void matrixChainMultiplication(int[] p, int n) {
        int[][] m = new int[n + 1][n + 1];
        int[][] s = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            m[i][i] = 0;
        }

        for (int l = 2; l <= n; l++) {
            for (int i = 1; i <= (n - l + 1); i++) {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int q = m[i][k] + m[k + 1][j] + (p[i - 1] * p[k] * p[j]);
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }

        System.out.println("Minimum number of scalar products required: " + m[1][n]);
        System.out.print("Optimally parenthesized matrices are: ");
        printOptimalParentheses(s, 1, n);
    }

    public static void printOptimalParentheses(int[][] s, int i, int j) {
        if (i == j) {
            System.out.print("A" + i);
        } else {
            System.out.print("(");
            printOptimalParentheses(s, i, s[i][j]);
            printOptimalParentheses(s, s[i][j] + 1, j);
            System.out.print(")");
        }
    }
}
