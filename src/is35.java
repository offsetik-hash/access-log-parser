public class is35 {

    public static boolean is35(int x) {

        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        } else if (x % 3 == 0 || x % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int x1 = 0;
        boolean result1 = is35(x1);
        System.out.println("x=" + x1);
        System.out.println("результат: " + result1);

        int x2 = 9;
        boolean result2 = is35(x2);
        System.out.println("x=" + x2);
        System.out.println("результат: " + result2);

        int x3 = 10;
        boolean result3 = is35(x3);
        System.out.println("x=" + x3);
        System.out.println("результат: " + result3);

        int x4 = 7;
        boolean result4 = is35(x4);
        System.out.println("x=" + x4);
        System.out.println("результат: " + result4);

        int x5 = 30;
        boolean result5 = is35(x5);
        System.out.println("x=" + x5);
        System.out.println("результат: " + result5);

    }
}