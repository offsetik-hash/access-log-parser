public class MaxCalculator {

    public static int max(int x, int y) {

        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {

        int x1 = 5, y1 = 10;
        int result1 = max(x1, y1);
        System.out.println("x=" + x1 + " y=" + y1);
        System.out.println("результат: " + result1);

        int x2 = -3, y2 = 7;
        int result2 = max(x2, y2);
        System.out.println("x=" + x2 + " y=" + y2);
        System.out.println("результат: " + result2);

        int x3 = 0, y3 = 0;
        int result3 = max(x3, y3);
        System.out.println("x=" + x3 + " y=" + y3);
        System.out.println("результат: " + result3);

        int x4 = 15, y4 = 15;
        int result4 = max(x4, y4);
        System.out.println("x=" + x4 + " y=" + y4);
        System.out.println("результат: " + result4);

        int x5 = -10, y5 = -20;
        int result5 = max(x5, y5);
        System.out.println("x=" + x5 + " y=" + y5);
        System.out.println("результат " + result5);

        int x6 = 1000000, y6 = 9999999;
        int result6 = max(x6, y6);
        System.out.println("x=" + x6 + " y=" + y6);
        System.out.println("результат " + result6);

    }
}