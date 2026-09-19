import java.util.*;
public class LeftRotation2 {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of left-rotations(d): ");
        int d = sc.nextInt();
        d = d % arr.length;
        int[] temp = new int[d];
        for(int i = 0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i<arr.length; i++){
            arr[i-d] = arr[i];
        }
        for(int i = arr.length-d; i<arr.length; i++){
            arr[i] = temp[i-(arr.length-d)];
        }
       System.out.println(Arrays.toString(arr));

       sc.close();
    }
}
// Left rotating an array by d places 👆