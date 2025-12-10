public class DeleteNegative {
    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }
        int[] result = new int[count];

        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-1, -2, 3, -4, 5, 0, -6, 7,800,0};
        int[] result = deleteNegative(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

