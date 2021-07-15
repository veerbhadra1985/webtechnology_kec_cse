package assignment2;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        int tra[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Matrix : \n");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                tra[j][i] = mat[i][j];
            }
        }
        System.out.print("The Transpose Matrix is : \n");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(tra[i][j] + " ");
            }
            System.out.println();
        }
    }
}