public class RangeChecker {

    public static boolean isInRange(int a, int b, int num) {
        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;

        return num >= min && num <= max;
    }

    public static void main(String[] args) {

        int a1 = 10, b1 = 20, num1 = 15;
        boolean result1 = isInRange(a1, b1, num1);
        System.out.println("Число " + num1 + " в диапазоне [" + a1 + ", " + b1 + "] результат: " + result1);

        int a2 = 300, b2 = 298, num2 = 299;
        boolean result2 = isInRange(a2, b2, num2);
        System.out.println("Число " + num2 + " в диапазоне [" + a2 + ", " + b2 + "] результат: " + result2);

        int a3 = 5, b3 = 5, num3 = 5;
        boolean result3 = isInRange(a3, b3, num3);
        System.out.println("Число " + num3 + " в диапазоне [" + a3 + ", " + b3 + "] результат: " + result3);

        int a4 = 1, b4 = 10, num4 = 0;
        boolean result4 = isInRange(a4, b4, num4);
        System.out.println("Число " + num4 + " в диапазоне [" + a4 + ", " + b4 + "] результат: " + result4);

        int a5 = 1, b5 = 10, num5 = 10;
        boolean result5 = isInRange(a5, b5, num5);
        System.out.println("Число " + num5 + " в диапазоне [" + a5 + ", " + b5 + "] результат: " + result5);

        int a6 = 10, b6 = 1, num6 = 11;
        boolean result6 = isInRange(a6, b6, num6);
        System.out.println("Число " + num6 + " в диапазоне [" + a6 + ", " + b6 + "] результат: " + result6);

        int a7 = 0, b7 = 10, num7 = 9;
        boolean result7 = isInRange(a7, b7, num7);
        System.out.println("Число " + num7 + " в диапазоне [" + a7 + ", " + b7 + "] результат: " + result7);
    }
}