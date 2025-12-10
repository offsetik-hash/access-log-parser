package ru.courses.home_work;

public class chet {
    public static void main(String[] args) {
        System.out.println(chet(31));
    }

    public static String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i);
            if (i + 2 <= x) {
                result.append(",");
            }
        }
        return result.toString();


    }
}

