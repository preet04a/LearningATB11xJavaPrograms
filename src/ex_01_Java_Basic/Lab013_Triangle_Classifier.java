package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab013_Triangle_Classifier {
    public static void main(String[] args) {
        /* Write a program that classifies a triangle based on its side lengths.
         Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal),
         isosceles (exactly two sides are equal),
         or scalene (no sides are equal).
         Use an if-else statement to classify the triangle.*/

//        int num1 = Integer.parseInt(args[0]);
//        int num2 = Integer.parseInt(args[1]);
//        int num3 = Integer.parseInt(args[2]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first side of the triangle:  ");
        int num1 = sc.nextInt();
        System.out.println("Enter the length of second side of the triangle ");
        int num2 = sc.nextInt();
        System.out.println("Enter the length of third side of the triangle ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("The triangle is Equilateral (all sides are equal).");
        } else if (num1 == num2 || num2 == num3 || num3 == num1) {
            System.out.println("The triangle is Isosceles (exactly two sides are equal).");
        } else {
            System.out.println("The triangle is Scalene (no sides are equal).");
        }
    }
}
