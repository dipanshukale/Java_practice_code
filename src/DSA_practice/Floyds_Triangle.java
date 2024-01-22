package DSA_practice;

public class Floyds_Triangle {
    public  static void Floys_triagnle(int n){
        //outer loop

        int Counter =1;

        for (int i=1;i<=n; i++){
            //inner loop

            for (int j=1; j<=i; j++){

                System.out.print(Counter+ " ");
                Counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Floys_triagnle(8);
    }
}
