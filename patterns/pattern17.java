public class pattern17 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i <n; i++){
            for(int k = 0; k<n-(i+1); k++){
              System.out.print(" ");
            }
          for(int j = 0; j<=i; j++ ){
            System.out.print((char)('A'+ j));
          }
          for(int l = i-1; l>=0; l--){
            System.out.print((char)('A'+ l));
          }
          System.out.println();
        }
    }
}
