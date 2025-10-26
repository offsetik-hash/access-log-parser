public class UpperCaseChecker {

    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public static void main(String[] args) {
        char char1 = 'B';
        boolean result1 = isUpperCase(char1);
        System.out.println("Символ '" + char1 + "' результат: " + result1);

        char char2 = 'Z';
        boolean result2 = isUpperCase(char2);
        System.out.println("Символ '" + char2 + "' результат: " + result2);

        char char3 = 'a';
        boolean result3 = isUpperCase(char3);
        System.out.println("Символ '" + char3 + "' результат: " + result3);

        char char4 = 'c';
        boolean result4 = isUpperCase(char4);
        System.out.println("Символ '" + char4 + "' результат: " + result4);

        char char5 = 'M';
        boolean result5 = isUpperCase(char5);
        System.out.println("Символ '" + char5 + "' результат: " + result5);

        char char6 = '1';
        boolean result6 = isUpperCase(char6);
        System.out.println("Символ '" + char6 + "' результат: " + result6);

        char char7 = '@';
        boolean result7 = isUpperCase(char7);
        System.out.println("Символ '" + char7 + "' результат: " + result7);

        char char8 = '0';
        boolean result8 = isUpperCase(char8);
        System.out.println("Символ '" + char8 + "' результат: " + result8);
    }
    }
