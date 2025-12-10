public class Add {
    public static int[] add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("не в рамках массива");
        }

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int x = 8;
        int pos = 3;

        int[] result = add(arr, x, pos);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}