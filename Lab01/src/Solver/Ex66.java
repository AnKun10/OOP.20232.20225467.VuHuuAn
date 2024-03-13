package Solver;

import java.util.Arrays;
import java.util.Scanner;

public class Ex66 {
    private static double[][] inpMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows = ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.print("Enter number of columns = ");
        int cols = Integer.parseInt(sc.nextLine());
        double[][] douMatrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.out.printf("Enter row %d (each element is separated by a space) (max %d): ", i, cols);
            String[] strRow = sc.nextLine().split(" ");
            double[] douRow = new double[strRow.length];
            for (int j = 0; j < douRow.length; j++) {
                douRow[j] = Double.parseDouble(strRow[j]);
            }
            douMatrix[i] = douRow;
            System.out.println();
        }
        return douMatrix;
    }
    public static void solve() {
        double[][] matrix1 = inpMatrix();
        double[][] matrix2 = inpMatrix();
        int m = matrix1.length;
        int n = matrix1[0].length;
        double[][] sum = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println(Arrays.toString(sum));
    }
}
