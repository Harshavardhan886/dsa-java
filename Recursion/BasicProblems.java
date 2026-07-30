import java.util.Scanner;
public class BasicProblems {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = sc.nextInt(), count  = 1;
       // first(n, count);
        //second(n, count);
        third(n, count);
        //backtrack(n);

        sc.close();
    }
    public static void first(int n, int count){
        // Printing the name for "n" times.
    System.out.println("Harshavardhan");
    count++;
    if(count == n){
        return;
    }
    first(n, count);
    }

    public static void second(int n, int count){
        // Print Linearly from 1 to N.
    System.out.println(count);
    count++;
    if(count> n){
        return;
    }
    second(n, count);
    }

    public static void third(int n, int count){
        // Print from N to 1
        System.out.println(n);
        n--;
        if(count>n){
            return;
        }
     third(n, count);
    }

    public static void backtrack(int i) {
        if(i < 1) return;
        backtrack(i - 1);        // recursive call first
        System.out.println(i);   // print after recursion
    }
}
