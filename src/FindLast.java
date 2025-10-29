public class FindLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};

        int x = 5;
        int index = findLast(arr, x);
        System.out.println("Индекс последнего вхождения числа " + x + ": " + index);

        x = 6;
        index = findLast(arr, x);
        System.out.println("Индекс последнего вхождения числа " + x + ": " + index);
    }

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}

