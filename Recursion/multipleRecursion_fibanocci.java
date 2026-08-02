import java.util.Scanner;
public class multipleRecursion_fibanocci {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the n value: ");
      int n = sc.nextInt();
      
      int result = fiba(n);
      System.out.println(result);

      sc.close();  
    }

    static int fiba(int n){
        if(n<=1) return n;
        int last = fiba(n-1);
        int lastSecond = fiba(n-2);
        return last + lastSecond;
    }
}
