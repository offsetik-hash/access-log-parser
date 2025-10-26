import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        scanner.close();

        // Вычисление суммы
        int sum = num1 + num2;
        System.out.println("Сумма: " + sum);

        // Вычисление разности
        int difference = num1 - num2;
        System.out.println("Разность: " + difference);

        // Вычисление произведения
        int product = num1 * num2;
        System.out.println("Произведение: " + product);

        // Вычисление частного
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Частное: " + quotient);
        } else {
            System.out.println("Деление на ноль недопустимо.");
        }
    }
}