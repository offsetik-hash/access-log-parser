public class Sum3 {

    public static boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public static void main(String[] args) {
        int x1 = 5, y1 = 2, z1 = 7;
        boolean result1 = sum3(x1, y1, z1);
        System.out.println("x=" + x1 + " y=" + y1 + " z=" + z1);
        System.out.println("результат: " + result1);

        int x2 = 3, y2 = 3, z2 = 6;
        boolean result2 = sum3(x2, y2, z2);
        System.out.println("x=" + x2 + " y=" + y2 + " z=" + z2);
        System.out.println("результат: " + result2);

        int x3 = 1, y3 = 2, z3 = 4;
        boolean result3 = sum3(x3, y3, z3);
        System.out.println("x=" + x3 + " y=" + y3 + " z=" + z3);
        System.out.println("результат: " + result3);

        int x4 = 100, y4 = -0, z4 = -0;
        boolean result4 = sum3(x4, y4, z4);
        System.out.println("x=" + x4 + " y=" + y4 + " z=" + z4);
        System.out.println("результат: " + result4);

    }
}