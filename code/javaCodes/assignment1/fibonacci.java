package assignment1;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, j = 0;
        System.out.printf("Enter The number : ");
        number = sc.nextInt();
        sc.close();
        for (int i = 1; i <= number; i++) {
            System.out.println(calculateFibonacci(j));
            j++;
        }
    }

    static int calculateFibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return (calculateFibonacci(num - 1) + calculateFibonacci(num - 2));
        }
    }
}
