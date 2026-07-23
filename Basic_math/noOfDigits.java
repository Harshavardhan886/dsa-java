// Finding no. of digits in the Number
// To find it we need to divide the number by 10 and increacrese the count the times it divides the number
// Or we can use the formula log₁₀(number)+1


public class noOfDigits {
    public static void main(String[] args) {
        int n = 156, count = 0;
      firstMeth(n, count);
      secondMeth(n, count);
      
    }
    static void firstMeth(int n, int count){
         while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("The total number of digits are: "+count);
    }

    static void secondMeth(int n, int count){
        count = (int) Math.log10(n)+1;
        System.out.println(count);
    }
}
