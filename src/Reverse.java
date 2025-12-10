public class Reverse {
        public static void reverse(int[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};

            reverse(arr);

            StringBuilder reversedArrayStr = new StringBuilder();
            reversedArrayStr.append("[");
            for (int i = 0; i < arr.length; i++) {
                reversedArrayStr.append(arr[i]);
                if (i < arr.length - 1) {
                    reversedArrayStr.append(", ");
                }
            }
            reversedArrayStr.append("]");

            System.out.println(reversedArrayStr.toString());
        }
    }

