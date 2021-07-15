package assignment2;

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        boolean fl = true;
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
                if (i == j && mat[i][j] != 1) {
                    fl = false;
                    break;
                }
                if (i != j && mat[i][j] != 0) {
                    fl = false;
                    break;
                }
            }
        }
        if (fl) {
            System.out.println("The Matrix is an Identity Matrix");
        } else {
            System.out.println("The Matrix is not an Identity Matrix");
        }
    }
}
