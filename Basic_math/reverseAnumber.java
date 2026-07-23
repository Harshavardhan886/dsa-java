// REVERSE A NUMBER
// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note: If a number has Tralling Zeroes, then its Reverse will not include them for example: 10400 will be 401 instead of 00401.
public class reverseAnumber {
    public static void main(String[] args){
     int n = 1234, reverse = 0;
     while(n>0){
        int digit = n%10;
        reverse = reverse*10 + digit;
        n = n/10;
     }
     System.out.println("The reverse of the number is: "+ reverse);
    }
}
