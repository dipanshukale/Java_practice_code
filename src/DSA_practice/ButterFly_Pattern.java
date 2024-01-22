package DSA_practice;

public class ButterFly_Pattern {

    public static void Butterfly(int n){

        //1St half

        for (int i=1; i<=n; i++){

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for (int s=1; s<= 2*(n-i); s++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //2nd half
        //invert the outer loop for reverse
        for (int i=n; i>=1; i--){


            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for (int s=1; s<= 2*(n-i); s++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Butterfly(5);
    }
}
