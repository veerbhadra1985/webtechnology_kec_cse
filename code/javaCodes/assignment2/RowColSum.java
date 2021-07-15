package assignment2;

import java.util.Scanner;

public class RowColSum {
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        int rowSum, colSum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Matrix : \n");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < mat.length; i++) {
            rowSum = 0;
            for (int j = 0; j < mat.length; j++) {
                rowSum = rowSum + mat[i][j];
            }
            System.out.printf("The sum of %d row is %d \n", i + 1, rowSum);
        }
        for (int i = 0; i < mat.length; i++) {
            colSum = 0;
            for (int j = 0; j < mat.length; j++) {
                colSum = colSum + mat[j][i];
            }
            System.out.printf("The sum of %d column is %d \n", i + 1, colSum);
        }
    }
}
