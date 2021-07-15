package assignment1;

import java.util.Scanner;

class calculator {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int firstNumber, secondNumber, choice;
                System.out.printf("Enter the First Number : ");
                firstNumber = sc.nextInt();
                System.out.printf("Enter the Second Number : ");
                secondNumber = sc.nextInt();
                System.out.println("Press 1 for Addition !!!");
                System.out.println("Press 2 for Substraction !!!");
                System.out.println("Press 3 for Multiplication !!!");
                System.out.println("Press 4 for Division !!!");
                System.out.println("Please Enter Your Choice");
                choice = sc.nextInt();
                sc.close();
                switch (choice) {
                        case 1:
                                System.out.printf("The Addition of the Number is : %d", firstNumber + secondNumber);
                                break;
                        case 2:
                                System.out.printf("The Substraction of the Number is : %d", firstNumber - secondNumber);
                                break;
                        case 3:
                                System.out.printf("The Multiplication of the Number is : %d",
                                                firstNumber * secondNumber);
                                break;
                        case 4:
                                System.out.printf("The Division of the Number is : %d", firstNumber / secondNumber);
                                break;

                        default:
                                break;
                }

        }
}