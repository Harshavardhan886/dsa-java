import java.util.ArrayList;

public class subsequenceSumK {
    static int[] arr = {1,2,1};
    public static void main(String[] args) {
	  
		subsequences(0, 3, 0, new ArrayList<>());
	}
	
	static void subsequences(int index, int k, int currentSum, ArrayList<Integer> list){
	    if(index == arr.length){
	        if(currentSum == k){
	            System.out.println(list);
	        }
            return;
	    }
	    
	    list.add(arr[index]);
	    subsequences(index+1, k, currentSum + arr[index], list);
	    
	    list.remove(list.size()-1);
	    subsequences(index+1, k, currentSum, list);
	    
	}
}
