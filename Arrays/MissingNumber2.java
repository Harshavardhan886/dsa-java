// Method2 : Better Solution (using hashing)
/*
public class MissingNumber2 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        int[] hash = new int[6];
        for(int i = 0; i<arr.length; i++){
            hash[arr[i]]++;
        }
        for(int i = 1; i<hash.length; i++){
            if(hash[i] == 0){
                System.out.println("Missing element: "+ i);
            }
        }
    }
}
*/

// Method3: Optimal solution (using sum and XOR)
// This method only works for the sorted array, for unsorted array we just need to find the max num in diff method.
class MissingNumber2{
     public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = arr[arr.length-1], sum = (n*(n+1))/2;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            count += arr[i];
        }
        int result = sum - count;
        System.out.println("The missing number is: "+result);
        
    }
}
// XOR METHOD IS STILL THERE TO LEARN