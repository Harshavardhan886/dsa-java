// method 1: Brute forece method

/*
public class MissingNumber1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
       for(int i = 1; i<arr.length; i++){
           int flag = 0;
           for(int j = 0; j<arr.length-1; j++){
               if(arr[j] == i){
                   flag = 1;
                   break;
               }
           }
           if(flag == 0){
               System.out.println(i);
           }
       }
    }
}
*/

class MissingNumber1{
     public static void main(String[] args) {
       int[] arr = {1,2,4,5};
        int j= 1;
        for(int i = 0; i<arr.length; i++){
           if(arr[i] != j){
               System.out.println(j);
               break;
           }
            j++;
            }
        }
}
// above 2 codes only print the first missing number in the array.