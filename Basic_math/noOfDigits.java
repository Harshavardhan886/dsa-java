// Finding no. of digits in the Number
// To find it we need to divide the number by 10 and increacrese the count the times it divides the number


public class noOfDigits {
    public static void main(String[] args) {
        int n = 156, count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("The total number of digits are: "+count);
    }
}
