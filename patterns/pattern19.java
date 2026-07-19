public class pattern19 {
    public static void main(String[] args){
        int n = 5;
        one(n);
        two(n);
    }
    public static void one(int n){
     for(int i = n; i>0; i--){
            for(int j = 0; j<i; j++){
             System.out.print("*");
            }
            for(int l = 0; l<(n-i)*2; l++){
                System.out.print(" ");
            }
            for(int k = i; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }        
    }

public static void two(int n){
     for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
             System.out.print("*");
            }
            for(int l = 0; l<(n-i)*2; l++){
                System.out.print(" ");
            }
            for(int k = i; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
