package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab010_Task_UserInput1 {
    public static void main(String[] args) {
        // Take a user input - Name, Age and Salary and print them in the end.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println("Enter your salary : ");
        long salary = scanner.nextLong();
    }
}
