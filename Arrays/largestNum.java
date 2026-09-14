public class largestNum {
    public static void main(String[] args) {

    int[] arr = {3, 2, 1, 5, 2};
    int greatestNum = arr[0];
    for(int i = 0; i<arr.length; i++){
     if(greatestNum<arr[i]){
        greatestNum = arr[i];
     }
    }
    System.out.print("The greatest Number is: "+greatestNum);
    }
    
}
