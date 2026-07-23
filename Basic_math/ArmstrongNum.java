import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(), sum = 0;
        int temp = n;
        while(n>0){
            int digit = n%10;
            if(temp<999){
          sum = sum + digit*digit*digit;
            }else{
            sum = sum + digit*digit*digit*digit;    
            }
          n = n/10;
        }
        if(temp == sum){
            System.out.println("The number "+temp+" is Armstrong number");
        }else{
            System.out.println("The number "+temp+" is not Armstrong number");
        }
        sc.close();
    }
}


// int digits = String.valueOf(temp).length();
//sum = sum + (int)Math.pow(digit, digits);
// 👆 make this code less complex by using tht above lines after learning the string traversal(update later)