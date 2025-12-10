public class Sum {
    public static void main(String[] args) {
        double totalSum = 0;

        for (String arg : args) {
            if (isNumeric(arg)) {
                double number = Double.parseDouble(arg);
                totalSum += number;
            }
        }

        System.out.println(totalSum);
    }
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
