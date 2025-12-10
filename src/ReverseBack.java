public class ReverseBack {
    public static int[] reverseBack(int[] arr) {
        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }

        return reversedArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = reverseBack(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
