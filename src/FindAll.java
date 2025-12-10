public class FindAll {
    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index++] = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 2, 2, 9};
        int x = 2;
        int[] result = findAll(arr, x);

        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}