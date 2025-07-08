package ex_01_Java_Basic;

public class Lab005_Task_Grade_Calculator {

    public static void main(String[] args) {

        String score1 = args[5];
        //System.out.println(score1);
        //System.out.println(score1 instanceof String);

        int score = Integer.parseInt(score1);
        String grade = (score <=59) ? "E" : (score <= 69) ? "D" : (score <= 79) ? "C" : (score <= 89) ? "B" : (score <= 100) ? "A" : "Invalid";
        System.out.println("Score = " + score);
        System.out.println("Grade = " + grade);


        /* Write a program that calculates and displays the letter grade
        for a given numerical score (e.g., A, B, C, D, or F)
        based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
         */

    }
}
