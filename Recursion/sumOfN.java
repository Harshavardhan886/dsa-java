import java.util.Scanner;
class sumOfN{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n value: ");
    int n = sc.nextInt(), sum = 0;
    sumation(n, sum);
    int result = sumation2(n);
    System.out.println(result);

    sc.close();
}

public static void sumation(int n, int sum){
        // Parameterised way 👆    👆
    if (n<1) {
    System.out.println(sum);
    return;
}
sumation(n-1, sum+n);
}

public static int sumation2(int n){
     // Functional way.
    if(n==0){
        return 0;
    }
    return n + sumation2(n-1);
}

}