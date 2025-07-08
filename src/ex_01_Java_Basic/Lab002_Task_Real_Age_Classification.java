package ex_01_Java_Basic;

public class Lab002_Task_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult, Minor, Senior
        // age < 18 , age > 18 and age < 65, age > 65
        // take input from user through CLI
        String age1 = args[1];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);
        String result = (age < 18 ) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);
    }
}
