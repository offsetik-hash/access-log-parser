public class Magic6 {

    public static boolean magic6(int x, int y) {

        return (x == 6) || (y == 6) || (x + y == 6) || (x - y == 6) || (y - x == 6);
    }

    public static void main(String[] args) {

        int x1 = 1, y1 = 6;
        boolean result1 = magic6(x1, y1);
        System.out.println("x=" + x1 + " y=" + y1);
        System.out.println("результат: " + result1);


        int x2 = 3, y2 = 3;
        boolean result2 = magic6(x2, y2);
        System.out.println("x=" + x2 + " y=" + y2);
        System.out.println("результат: " + result2);


        int x3 = 8, y3 = 2;
        boolean result3 = magic6(x3, y3);
        System.out.println("x=" + x3 + " y=" + y3);
        System.out.println("результат: " + result3);


        int x4 = 5, y4 = 7;
        boolean result4 = magic6(x4, y4);
        System.out.println("x=" + x4 + " y=" + y4);
        System.out.println("результат: " + result4);

    }
}