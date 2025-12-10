package ru.courses.home_work;

public class DivisorChecker {

    public static boolean isDivisor(int a, int b) {
        if (b != 0 && a % b == 0) {
            return true;
        }

        if (a != 0 && b % a == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a1 = 10, b1 = 5;
        boolean result1 = isDivisor(a1, b1);
        System.out.println("a=" + a1 + "b=" + b1 + "результат:" + result1);

        int a2 = 15, b2 = 4;
        boolean result2 = isDivisor(a2, b2);
        System.out.println("a=" + a2 + "b=" + b2 + "результат: " + result2);

        int a3 = 1000, b3 = 5;
        boolean result3 = isDivisor(a3, b3);
        System.out.println("a=" + a3 + "b=" + b3 + "результат: " + result3);

        int a4 = 7, b4 = 0;
        boolean result4 = isDivisor(a4, b4);
        System.out.println("a=" + a4 + "b=" + b4 + "результат: " + result4);

        int a5 = 9, b5 = 3;
        boolean result5 = isDivisor(a5, b5);
        System.out.println("a=" + a5 + "b=" + b5 + "результат: " + result5);

        int a6 = 0, b6 = 0;
        boolean result6 = isDivisor(a6, b6);
        System.out.println("a=" + a6 + "b=" + b6 + "результат: " + result6);
    }
}