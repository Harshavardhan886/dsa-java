import java.util.Scanner;
public class pattern5 {
     public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enetr the number: ");
   int n = sc.nextInt();
   for(int i= 1; i<=n; i++){
    for(int j = i; j<=n; j++){
System.out.print("*");

    }
    System.out.println();
   }
   sc.close();
    }
}
