import java.util.Scanner;
public class basicHashing{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the array length: ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	
	System.out.print("Enter the array elements: ");
	for(int i =0; i<n; i++){
	    arr[i] = sc.nextInt();
	}
	
	int[] hash = new int[13];
	for(int i = 0; i<n; i++){
	    hash[arr[i]]++;
	}
	
	System.out.print("Enter no.of queries: ");
	int q = sc.nextInt();
	while(q-->0){
	    System.out.print("Enter the number to find its repetations: ");
	    int num = sc.nextInt();
	    System.out.println(hash[num]);
	}
	
	sc.close();
	}
}