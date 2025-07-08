package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab012_Task_EvenOrOdd {
    public static void main(String[] args) {
        // Take user input & Check whether the input is even or odd number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        String result = (a%2==0) ? "A is even" : "A is odd";
        System.out.println(result);
        /*
        if(a%2==0){
            System.out.println(number+" is an even number");
        } else{
            System.out.println(number+ " is an odd number");
        }
         */
    }
}
