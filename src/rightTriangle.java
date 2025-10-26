public class rightTriangle {
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Треугольник высотой 3:");
        rightTriangle(4);
        System.out.println();

        System.out.println("Треугольник высотой 4:");
        rightTriangle(5);
    }
}