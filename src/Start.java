public class Start  {
    public static void main(String[] args) {
        System.out.println(listNums(37));
    }

    public static String listNums(int x) {
        String result = "результат = ";
        for (int i = 0; i <= x; i++) {
            result += i;
            if (i < x) {
                result += ",";
            }
        }
        return result;
    }
}
