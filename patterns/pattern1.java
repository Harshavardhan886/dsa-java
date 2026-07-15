/* https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa

Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



*****

*****

*****

*****

*****



Print the pattern in the function given to you. */
import java.util.Scanner;
class pattern1 {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enetr the Number: ");
int N = sc.nextInt();
for(int i = 1; i<=N; i++){
    for(int j = 1; j<=N; j++){
      System.out.print("*");
    }
    System.out.println();
}
sc.close();
    }
}