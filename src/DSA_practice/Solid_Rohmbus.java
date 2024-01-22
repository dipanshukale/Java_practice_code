package DSA_practice;

public class Solid_Rohmbus {
    public static void Rohmbus(int n){
        for (int i=1; i<=n; i++){

            //spaces

            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //stars

            for (int s=1; s<=n; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //hallow Rohmbus

    public  static  void Hallow_Rohmbus(int n){
        for (int i =1; i<=n; i++){

            //spaces

            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //hallow Rectangle

            for (int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }
    }

    public static void main(String[] args) {
        Hallow_Rohmbus(8);
    }
}
