import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size N of matrix (N*N): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i)
                    matrix[i][j] = 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
