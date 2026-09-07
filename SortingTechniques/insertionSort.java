import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 9, 15, 12, 6, 8, 3};

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            // ✅ use j and swap adjacent elements until key is in place
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j, j - 1);
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
