public class SafeDivision {

    public static int safeDiv(int x, int y) {

        if (y == 0) {
            return 0;
        } else {
            return x / y;
        }
    }

    public static void main(String[] args) {

        int x1 = 10, y1 = 10;
        int result1 = safeDiv(x1, y1);
        System.out.println("x=" + x1 + " y=" + y1);
        System.out.println("результат: " + result1);

        int x2 = 10, y2 = 0;
        int result2 = safeDiv(x2, y2);
        System.out.println("x=" + x2 + " y=" + y2);
        System.out.println("результат: " + result2);

        int x3 = 15, y3 = 3;
        int result3 = safeDiv(x3, y3);
        System.out.println("x=" + x3 + " y=" + y3);
        System.out.println("результат: " + result3);

        int x4 = 100, y4 = 2;
        int result4 = safeDiv(x4, y4);
        System.out.println("x=" + x4 + " y=" + y4);
        System.out.println("результат: " + result4);

        int x5 = 0, y5 = 5;
        int result5 = safeDiv(x5, y5);
        System.out.println("x=" + x5 + " y=" + y5);
        System.out.println("результат: " + result5);
    }
}