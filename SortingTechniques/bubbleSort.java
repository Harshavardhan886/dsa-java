import java.util.Arrays;
class bubbleSort{
    public static void main(String[] args) {
        int [] arr  = {13, 46, 24, 52, 20, 9};

        for(int i = arr.length-1; i>=1; i--){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]) swap(arr, j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static  void swap(int[] arr, int j){
        int temp = arr[j+1];
        arr[j+1] = arr[j];
        arr[j] = temp;
    }
}