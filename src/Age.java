public class Age {
    public static String age(int x) {
        if (x % 10 == 1 && x % 100 != 11) {
            return x + " год";
        } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x % 100 != 12 && x % 100 != 13 && x % 100 != 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public static void main(String[] args) {
        System.out.println("x=1 результат: " + age(4));
        System.out.println("x=2 результат: " + age(55));
        System.out.println("x=3 результат: " + age(259));
        System.out.println("x=4 результат: " + age(2025));
        System.out.println("x=5 результат: " + age(11111));

    }
}