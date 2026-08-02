import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size(n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        firstMethod(0, n-1, arr);
        secondMethod(0, n, arr);

        System.out.println("The array elements after swap: ");
        for(int num : arr){
            System.out.println(num);
        }

     sc.close();
    }
    
     static void firstMethod(int start, int end, int[] arr){
        if(start>= end) return;
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        firstMethod(start+1, end-1, arr);
    }

    static void secondMethod(int i, int n, int[] arr){
     // This is the more effective method tht causes less time complexity and space complexity.
     if(i>= n-i-1) return;

     int temp = arr[i];
     arr[i] = arr[n-i-1];
     arr[n-i-1] = temp;

     secondMethod(i+1, n, arr);
    }
    
}
