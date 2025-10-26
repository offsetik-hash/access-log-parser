public class numLen {
    public static void main(String[] args) {
        System.out.println(numLen(123));
        System.out.println(numLen(88));
    }

    public static int numLen(long x) {
        if (x == 0) {
            return 1;
        }

        int length = 0;
        while (x != 0) {
            x /= 10;
            length++;
        }
        return length;
    }
}
