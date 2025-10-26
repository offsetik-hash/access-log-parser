public class Day {
    public static String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    public static void main(String[] args) {

        System.out.println("x=1 результат: " + day(1));
        System.out.println("x=2 результат: " + day(2));
        System.out.println("x=3 результат: " + day(3));
        System.out.println("x=4 результат: " + day(4));
        System.out.println("x=5 результат: " + day(5));
        System.out.println("x=6 результат: " + day(6));
        System.out.println("x=7 результат: " + day(7));
        System.out.println("x=8 результат: " + day(8));
    }
}