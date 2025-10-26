public class FractionCalculator {

    public static double fraction(double x) {

        long integerPart = (long) x;

        double fractionalPart = x - integerPart;
        return Math.round(fractionalPart * 1000.0) / 1000.0;
    }

    public static void main(String[] args) {
        double number = 7.8;
        double result = fraction(number);
        System.out.printf("Дробная часть числа %.1f: %.3f%n", number, result);
    }
}