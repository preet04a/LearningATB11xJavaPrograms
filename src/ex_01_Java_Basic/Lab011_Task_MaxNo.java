package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab011_Task_MaxNo {
    public static void main(String[] args) {
        // Take a user input 2 numbers from the arguments and
        // calculate the maximum in between with ternary operator.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int max = (num1 > num2) ? num1 : num2 ;
        System.out.println("The maximum of the two numbers is: " + max);
        /* alternate
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String result = (num1 > num2) ? "Your first number is greater" : "Your second number is greater";
        System.out.println(result);
         */

    }
}
