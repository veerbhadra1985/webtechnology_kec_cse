package assignment2;

import java.util.Scanner;

public class CopyElements {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Elements : \n");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Copied Array : \n");
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
            System.out.print(b[i] + " ");
        }
    }
}