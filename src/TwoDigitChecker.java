public class TwoDigitChecker {

    public static boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }

    public static void main(String[] args) {

        int number1 = 39;
        boolean result1 = is2Digits(number1);
        System.out.println("x=" + number1 + " результат: " + result1);

        int number2 = 516;
        boolean result2 = is2Digits(number2);
        System.out.println("x=" + number2 + " результат: " + result2);

        int number3 = 0;
        boolean result3 = is2Digits(number3);
        System.out.println("x=" + number3 + " результат: " + result3);

        int number4 = 9;
        boolean result4 = is2Digits(number4);
        System.out.println("x=" + number4 + " результат: " + result4);

        int number5 = 10;
        boolean result5 = is2Digits(number5);
        System.out.println("x=" + number5 + " результат: " + result5);

        int number6 = 99;
        boolean result6 = is2Digits(number6);
        System.out.println("x=" + number6 + " результат: " + result6);

        int number7 = -10000;
        boolean result7 = is2Digits(number7);
        System.out.println("x=" + number7 + " результат: " + result7);

        int number8 = 10000000;
        boolean result8 = is2Digits(number8);
        System.out.println("x=" + number8 + " результат: " + result8);
    }

}