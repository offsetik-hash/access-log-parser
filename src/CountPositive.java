public class CountPositive {
    public static int countPositive(int[] arr) {
        int positiveCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            }
        }

        return positiveCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        int result = countPositive(arr);
        System.out.println("Количество положительных элементов массива arr: " + result);
    }
}
