import java.util.Scanner;
class divisiors{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    first(n);
    System.out.println("=======================");
    second(n);
    sc.close();
    }
    public static void first(int n){
      for(int i = 1; i<=n; i++){
        if(n%i==0){
            System.out.println(i);
        }
      }
    }

    public static void second(int n){
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(i);
                if((n / i)!= i){       
            System.out.println(n / i);
        }
            }
        }
    }
}