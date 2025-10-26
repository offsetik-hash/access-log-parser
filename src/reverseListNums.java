public class reverseListNums {
    public static void main(String[] args) {
        System.out.println(reverseListNums(26)); // Выведет: "5 4 3 2 1 0"
    }

    public static String reverseListNums(int x) {
        String result = "результат = ";
        for (int i = x; i >= 0; i--) {
            result += i;
            if (i > 0) {
                result += ",";
            }
        }
        return result +" to be continued";
    }
}