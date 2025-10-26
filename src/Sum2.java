public class Sum2 {
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int result = sum2(x, y);
        System.out.println("x=" + x + " y=" + y);
        System.out.println("результат: " + result);

        int x2 = 3;
        int y2 = -6;
        int result2 = sum2(x2, y2);
        System.out.println("x=" + x2 + " y=" + y2);
        System.out.println("результат: " + result2);

        int x3 = 15;
        int y3 = 4;
        int result3 = sum2(x3, y3);
        System.out.println("x=" + x3 + " y=" + y3);
        System.out.println("результат: " + result3);

        int x4 = 10;
        int y4 = 10;
        int result4 = sum2(x4, y4);
        System.out.println("x=" + x4 + " y=" + y4);
        System.out.println("результат: " + result4);
    }
}