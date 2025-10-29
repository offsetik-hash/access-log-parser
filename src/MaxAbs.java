public class MaxAbs {

    public static void main(String[] args) {
        int[] arr = {1, -2, -7, 4, 2, 2, 5};

        int result = maxAbs(arr);
        System.out.println("Наибольшее значение по модулю: " + result);
    }

    public static int maxAbs(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Пустой или null");
        }

        int maxAbsValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxAbsValue)) {
                maxAbsValue = arr[i];
            }
        }

        return maxAbsValue;
    }
}

