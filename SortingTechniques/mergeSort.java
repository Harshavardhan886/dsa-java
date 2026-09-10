import java.util.*;
class mergeSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array length: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.print("Enter the array elements: ");
    for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
    }

    MergeSort(arr, 0, n-1);
    System.out.println(Arrays.toString(arr));

    sc.close();
    }

    public static  void MergeSort(int[] arr, int low, int high){
        int mid = (low + high)/2;
     if(low>= high){
        return;
     }

     MergeSort(arr, low, mid);
     MergeSort(arr, mid+1, high);
     sort(arr, low, mid, high);

    }

    public static void sort(int[] arr, int low, int mid, int high){
        int[] temp = new int[arr.length];
        int left = low;
        int right = mid+1;
        int k = low;

         while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }
}