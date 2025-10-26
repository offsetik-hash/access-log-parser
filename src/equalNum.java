public class equalNum {
    public static void main(String[] args) {
        System.out.println(equalNum(2222));
        System.out.println(equalNum(1212));

    }
    public static boolean equalNum(int x) {
        if (x < 0) {
            x = -x;
        }

        if (x == 0) {
            return true;
        }

        int lastDigit = x % 10;
        x /= 10;

        while (x != 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}

