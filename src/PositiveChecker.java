public class PositiveChecker {

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static void main(String[] args) {

        int number1 = 10;
        boolean result1 = isPositive(number1);
        System.out.println("x=" + number1 + " результат: " + result1);

        int number2 = -5;
        boolean result2 = isPositive(number2);
        System.out.println("x=" + number2 + " результат: " + result2);

        int number3 = 0;
        boolean result3 = isPositive(number3);
        System.out.println("x=" + number3 + " результат: " + result3);

        int number4 = 04;
        boolean result4= isPositive(number4);
        System.out.println("x=" + number4 + " результат: " + result4);

        int number5 = 15;
        boolean result5 = isPositive(number5);
        System.out.println("x=" + number5 + " результат: " + result5);

        int number6 = 188;
        boolean result6 = isPositive(number6);
        System.out.println("x=" + number6 +  " результат: " + result6);


    }
}