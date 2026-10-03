import java.util.Scanner;
/*public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine().toLowerCase();
        int j = 0;
        boolean isStr = true;
        for(int i = str.length()-1; i>=0; i--){
           char ch1 = str.charAt(i);
           char ch2 = str.charAt(j);
           if(ch1 == ch2){
              j++;
              }else{
            System.out.println("The string is not palindrome");
            isStr = false;
            break;
           }
        }
        if(isStr != false){
          System.out.println("The string is palindrome");
        }

        sc.close();
    }
}
    */

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine().toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("The string is not palindrome");
                isPalindrome = false;
                break; 
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("The string is palindrome");
        }
        sc.close();
    }
}
