public class Palindrom {
    public static boolean palindrom(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -2, -7, 4, 2, 2, 5};
        int[] arr2 = {1, -2, -7, 4, -7, -2, 1};

        System.out.println("arr: " + palindrom(arr1));
        System.out.println("arr: " + palindrom(arr2));
    }
}
