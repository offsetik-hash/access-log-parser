public class ADD2 {
    public static int[] add2(int[] arr, int[] ins, int pos) {

        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("за рамками массива! ");
        }

        int[] newArr = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            newArr[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            newArr[pos + ins.length + i - pos] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {99, 100, 101};
        int pos = 4;

        int[] result = add2(arr, ins, pos);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
