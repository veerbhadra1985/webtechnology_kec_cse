package assignment2;

import java.util.Scanner;

public class EqualMatrices {
    public static void main(String[] args) {
        int mat1[][] = new int[3][3];
        int mat2[][] = new int[3][3];
        boolean fl = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Elements of First Matrix : \n");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the Elements of Second Matrix : \n");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    fl = false;
                    break;
                }
            }
        }
        if (fl) {
            System.out.println("Matrices are Equal  \n");
        } else {
            System.out.println("Matrices are Unequal  \n");
        }
    }
}
