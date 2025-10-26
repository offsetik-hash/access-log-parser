public class EqualityChecker {

    public static boolean isEqual(int a, int b, int c) {

        return a == b && b == c;
    }

    public static void main(String[] args) {

        int a1 = 3, b1 = 3, c1 = 3;
        boolean result1 = isEqual(a1, b1, c1);
        System.out.println("a=" + a1 + " b=" + b1 + " c=" + c1);
        System.out.println("результат: " + result1);


        int a2 = 15, b2 = 15, c2 = 15;
        boolean result2 = isEqual(a2, b2, c2);
        System.out.println("a=" + a2 + " b=" + b2 + " c=" + c2);
        System.out.println("результат: " + result2);

        int a3 = 5, b3 = 5, c3 = 5;
        boolean result3 = isEqual(a3, b3, c3);
        System.out.println("a=" + a3 + " b=" + b3 + " c=" + c3);
        System.out.println("результат: " + result3);

        int a4 = 7, b4 = 24, c4 = 8;
        boolean result4 = isEqual(a4, b4, c4);
        System.out.println("a=" + a4 + " b=" + b4 + " c=" + c4);
        System.out.println("результат: " + result4);

        int a5 = 0, b5 = 0, c5 = 0;
        System.out.println("a=" + a5 + " b=" + b5 + " c=" + c5);
        System.out.println("результат: " + result2);
    }
}