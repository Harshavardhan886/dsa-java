// method 1: bruteforce
import java.util.Arrays;
/* 
class ZeroesToEnd{
        public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        while(j < arr.length) {
            arr[j] = 0;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
*/

// Method 2: optimal Solution

class ZeroesToEnd{
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int j = -1;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

