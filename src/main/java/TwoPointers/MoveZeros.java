package TwoPointers;

public class MoveZeros {

    private static int[] moveZeros(int arr[]) {
        int i = 0;

        int nonZeroPtr = 0;
        // Move all non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[nonZeroPtr++] = num;
            }
        }
        // Fill the remaining positions with zeros
        while (nonZeroPtr < arr.length) {
            arr[nonZeroPtr++] = 0;
        }
//        for (int j = 1; j < arr.length; j++) {
//
//            if ((arr[i] == 0) && arr[j] != 0) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//            }
//            if (arr[i] != 0) {
//                    i++;
//            }
//
//        }
        return arr;
    }

    public static void main(String[] args) {
        // 0 1 0 3 12
        int arr[] = {0,0,1};
        arr = moveZeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
