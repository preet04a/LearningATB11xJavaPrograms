package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab009_if_Else {
    public static void main(String[] args) {
        // How to take user input
        // 1.CLI options
        // int age = Integer.parseInt(args[0]);
        // 2. Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        if(age > 18) {
            System.out.println("Allowed to vote!");
        } else {
            System.out.println("Not allowed!");
        }
    }

}
