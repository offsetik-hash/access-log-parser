public class void_square {
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println();
        square(5);
        System.out.println();

        System.out.println();
        square(4);
    }
}