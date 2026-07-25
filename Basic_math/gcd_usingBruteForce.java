import java.util.Scanner;
public class gcd_usingBruteForce {
    public static void main(String[] args) {
        int gcd= 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the n2: ");
        int n2 = sc.nextInt();

     first(n1, n2, gcd);
     second(n1, n2, gcd);
     // The above 2 methods are exactly same and take same space and time complexity. It is just a loop demonstration.
        sc.close();
    }

    public static void first(int n1, int n2, int gcd){
    for(int i = 1; i<=Math.min(n1, n2); i++ ){
        if(Math.min(n1, n2)%i==0){
         gcd = i;
        }
    }
    System.out.println("The gcd of "+n1+" and "+n2+" is "+gcd);
    }

    public static void second(int n1, int n2, int gcd){
     for(int i = Math.min(n1, n2) ; i>=1; i-- ){
        if(Math.min(n1, n2)%i==0){
         gcd = i;
         break;
        }
    }
    System.out.println("The gcd of "+n1+" and "+n2+" is "+gcd);
    }

}
