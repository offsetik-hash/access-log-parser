package ru.courses.summm;

public class SumCalculator {

    public static int sumLastNums(int x) {
        // Извлекаем последнюю цифру
        int lastDigit = x % 10;

        // Удаляем последнюю цифру, получая предпоследнюю цифру
        x = x / 10;

        // Извлекаем предпоследнюю цифру
        int secondLastDigit = x % 10;

        // Возвращаем сумму последней и предпоследней цифры
        return lastDigit + secondLastDigit;
    }

    public static void main(String[] args) {
        int number = 1234; // 3+4=7
        int result = sumLastNums(number);
        System.out.println("Сумма двух последних цифр числа " + number + ": " + result);
    }
}
//Необходимо реализовать метод таким образом,
// чтобы он возвращал результат сложения двух последних знаков числа х,
// предполагая, что знаков в числе не менее двух