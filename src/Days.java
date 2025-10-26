public class Days {
    public static void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("результат:понедельник");
            case "вторник":
                System.out.println("результат:вторник");
            case "среда":
                System.out.println("результат:среда");
            case "четверг":
                System.out.println("результат:четверг");
            case "пятница":
                System.out.println("результат:пятница");
            case "суббота":
                System.out.println("результат:суббота");
            case "воскресенье":
                System.out.println("результат:воскресенье");
                break;
            default:
                System.out.println("результат:это не день недели");
        }
    }

    public static void main(String[] args) {

        System.out.println("x=\"четверг\"");
        printDays("четверг");

        System.out.println("x=\"пьятница\"");
        printDays("пьятница");

        System.out.println("x=\"понедельник\"");
        printDays("понедельник");


    }
}