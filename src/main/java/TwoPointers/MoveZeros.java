package TwoPointers;

public class MoveZeros {

    private static int[] moveZeros(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {

            if ((arr[i] == 0) && arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            if (arr[i] != 0) {
                    i++;
            }

        }
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
