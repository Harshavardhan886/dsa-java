public class pattern22 {
    public static void main(String[] args) {
        int n = 7; 
        int layers = n / 2 + 1; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int min = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                System.out.print((layers - min) + " ");
            }
            System.out.println();
        }
    }
}
