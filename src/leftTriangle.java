public class leftTriangle {

        public static void leftTriangle(int x) {
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            System.out.println();
            leftTriangle(4);
            System.out.println();

            System.out.println();
            leftTriangle(5);
        }
    }

