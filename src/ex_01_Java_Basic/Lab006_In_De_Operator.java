package ex_01_Java_Basic;

public class Lab006_In_De_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // 11 + 11 + 12 = 34
        // a = 13
        int b = 20;
        System.out.println(--b + b++ + b--);
        System.out.println(b);
        // 19 + 19 + 20
        // b = 19
    }
}
