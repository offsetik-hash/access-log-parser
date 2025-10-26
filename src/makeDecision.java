public class makeDecision {

    public static String makeDecision(int x, int y) {

        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    public static void main(String[] args) {

        int x1 = 5, y1 = 7;
        String result1 = makeDecision(x1, y1);
        System.out.println("x=" + x1 + " y=" + y1);
        System.out.println("результат: " + result1);

        int x2 = 10, y2 = 5;
        String result2 = makeDecision(x2, y2);
        System.out.println("x=" + x2 + " y=" + y2);
        System.out.println("результат: " + result2);

        int x3 = 3, y3 = 3;
        String result3 = makeDecision(x3, y3);
        System.out.println("x=" + x3 + " y=" + y3);
        System.out.println("результат: " + result3);

        int x4 = 0, y4 = 0;
        String result4 = makeDecision(x4, y4);
        System.out.println("x=" + x4 + " y=" + y4);
        System.out.println("результат: " + result4);

        int x5 = -5, y5 = -10;
        String result5 = makeDecision(x5, y5);
        System.out.println("x=" + x5 + " y=" + y5);
        System.out.println("результат: " + result5);

        int x6 = 7, y6 = 7;
        String result6 = makeDecision(x6, y6);
        System.out.println("x=" + x6 + " y=" + y6);
        System.out.println("результат: " + result6);
    }
}