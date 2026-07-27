public class euclidean {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a); 
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}
