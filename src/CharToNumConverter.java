public class CharToNumConverter {

    public static int charToNum(char x) {
        return x - '0';
    }

    public static void main(String[] args) {

        char char1 = '5';
        int num1 = charToNum(char1);
        System.out.println("х='" + char1 + "' результат: " + num1);

        char char2 = '6';
        int num2 = charToNum(char2);
        System.out.println("х=" + char2 + "' результат: " + num2);

        char char3 = '7';
        int num3 = charToNum(char3);
        System.out.println("х= '" + char3 + "' результат: " + num3);

        char char4 = '9';
        int num4 = charToNum(char4);
        System.out.println("х= '" + char4 + "' результат: " + num4);

        char char5 = '0';
        int num5 = charToNum(char5);
        System.out.println("х='" + char5 + "' результат: " + num5);

    }
}
//x=’3’
//результат: 3