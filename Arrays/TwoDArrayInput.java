import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (n): ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns (m): ");
        int m = sc.nextInt();

        int[][] array = new int[n][m];

        System.out.println("Enter matrix elements (" + n + "x" + m + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix output:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
