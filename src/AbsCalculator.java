public class AbsCalculator {

    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {

        int x1 = 5;
        int result1 = abs(x1);
        System.out.println("x=" + x1);
        System.out.println("резултат: " + result1);

        int x2 = -3;
        int result2 = abs(x2);
        System.out.println("x=" + x2);
        System.out.println("результат: " + result2);

        int x3 = 0;
        int result3 = abs(x3);
        System.out.println("x=" + x3);
        System.out.println("результат: " + result3);

        int x4 = 10;
        int result4 = abs(x4);
        System.out.println("x=" + x4);
        System.out.println("результат: " + result4);

        int x5 = -15;
        int result5 = abs(x5);
        System.out.println("x=" + x5);
        System.out.println("результат: " + result5);
    }
}