public class pow {
    public static void main(String[] args) {

        System.out.println(pow(3, 4));
        System.out.println(pow(4, 3));

    }
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}

