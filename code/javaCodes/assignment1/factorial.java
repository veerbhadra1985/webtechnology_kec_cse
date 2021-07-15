package assignment1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Enter a positive Integer : ");
        n = sc.nextInt();
        System.out.printf("Factoiral of %d is : %d", n, factorialOfNumber(n));
        sc.close();
    }

    static int factorialOfNumber(int n) {
        if (n >= 1)
            return n * factorialOfNumber(n - 1);
        else
            return 1;
    }
}
