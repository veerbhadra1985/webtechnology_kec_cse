package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Elements in Array : \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.printf("Second Smallest Element is : %d", arr[1]);
    }
}
