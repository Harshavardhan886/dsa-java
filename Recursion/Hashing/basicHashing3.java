import java.util.Scanner;
// hashing only for the strings having all type of letters- symbols.
public class basicHashing3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the string: ");
	    String str = sc.nextLine();
	    
	    int[] hash = new int[256];
	    for(int i =0; i<str.length(); i++){
	        hash[(str.charAt(i))]++; 
	    }
	    
	    System.out.print("Enter no.of queries: ");
	    int q = sc.nextInt();
	    while(q-->0){
	        System.out.print("Enter the char: ");
	      char ch = sc.next().charAt(0);
	      System.out.println(hash[ch]);
	    }
	    sc.close();
	}
}

