import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number tht has to be found: ");
        int num = sc.nextInt();
        boolean found = false;
        for(int i = 0; i<arr.length; i++){
          if(arr[i] == num){
              System.out.println("Element found at index: "+i);
              found = true;
              break;
          }
        }
        if(!found){
            System.out.println("Element not found!");
        }
        sc.close();
    }
}
