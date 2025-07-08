package ex_01_Java_Basic;

public class Lab008_If_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age > 18){
            System.out.println("Yes you can go to GOA!");
        } else {
            System.out.println("You can't go to GOA!");
        }
    }
}
