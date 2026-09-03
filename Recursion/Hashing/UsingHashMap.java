import java.util.*;
public class UsingHashMap{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("Enter the array elements: ");
		for(int i = 0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		
		Map <Integer, Integer> mpp = new HashMap<>();
		for(int i =0; i<n; i++){
		mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
		    System.out.println(entry.getKey() + " --> "+ entry.getValue());
		}
		
		System.out.print("Enter no.of Quries: ");
		int q = sc.nextInt();
		while(q-->0){
		    int num = sc.nextInt();
		    System.out.println(mpp.getOrDefault(num, 0));
		}
		
		sc.close();
	}
}