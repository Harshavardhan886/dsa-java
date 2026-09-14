// Method 1: brute force 
/*import java.util.Arrays;

public class secondLargestNum {
    public static void main(String[] args) {
		int[] arr = {1,2,4,7,7,5};
		Arrays.sort(arr);
		int largestNum = arr[arr.length-1];
		for(int i = arr.length-2; i>=0; i--){
		    if(arr[i] < largestNum){
		        System.out.println("The Second largest number is: "+ arr[i]);
		        break;
		    }
		}
	}
}
*/

// Method 2: Optimal soln
public class secondLargestNum
{
	public static void main(String[] args) {
	    int[] arr = {1,2,4,7,7,5};
		int Lnum = arr[0];
		int SLnum = -1; 
		for(int i = 1; i<arr.length; i++){
		    if(Lnum<arr[i]){
		       Lnum = arr[i];
		    }
		}
		
		for(int i = 0; i<arr.length; i++){
		    if(SLnum<arr[i] && arr[i] != Lnum){
		        SLnum = arr[i];
		    }
		}
		System.out.println("Second largest Number in the array is: "+SLnum);
	}
}