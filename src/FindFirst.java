public class FindFirst {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        int x = 4;

        int index = findFirst(arr, x);
        System.out.println("Индекс первого вхождения числа " + x + ": " + index);

        x = 6;
        index = findFirst(arr, x);
        System.out.println("Индекс первого вхождения числа " + x + ": " + index);
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
