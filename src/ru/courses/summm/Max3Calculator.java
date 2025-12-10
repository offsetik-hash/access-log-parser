package ru.courses.summm;

public class Max3Calculator {

    public static int max3(int x, int y, int z) {
        int max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {

        int x1 = 5, y1 = 10, z1 = 3;
        int result1 = max3(x1, y1, z1);
        System.out.println("x=" + x1 + " y=" + y1 + " z=" + z1);
        System.out.println("результат: " + result1);

        int x2 = -3, y2 = 7, z2 = 1;
        int result2 = max3(x2, y2, z2);
        System.out.println("x=" + x2 + " y=" + y2 + " z=" + z2);
        System.out.println("результат: " + result2);

        int x3 = 0, y3 = 0, z3 = 0;
        int result3 = max3(x3, y3, z3);
        System.out.println("x=" + x3 + " y=" + y3 + " z=" + z3);
        System.out.println("результат: " + result3);

        int x4 = 15, y4 = 15, z4 = 15;
        int result4 = max3(x4, y4, z4);
        System.out.println("x=" + x4 + " y=" + y4 + " z=" + z4);
        System.out.println("результат: " + result4);

        int x5 = -10, y5 = -20, z5 = 0;
        int result5 = max3(x5, y5, z5);
        System.out.println("x=" + x5 + " y=" + y5 + " z=" + z5);
        System.out.println("результат: " + result5);
    }
}