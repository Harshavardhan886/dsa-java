public class palindrome {
    public static void main(String[] args){
        int n  = 121, rev  = 0;
        int temp = n;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        if(temp == rev){
            System.out.println("The number is a palindrome");
        }else{
            System.out.println("The number is not a palindrome");
        }
            
    }
}
