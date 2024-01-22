package DSA_practice;

public class zero_one_traingle {
    public  static  void zero_ones_trai(int n){
        //outer loop
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ( (i + j) % 2 == 0){
                    //even
                    System.out.print("1");
                }else {
                    //odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        zero_ones_trai(7);

    }
}
