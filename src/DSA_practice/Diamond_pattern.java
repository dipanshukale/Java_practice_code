package DSA_practice;

public class Diamond_pattern {

    public static void Diamond(int n){
        //1st half
        for (int i=1; i<=n; i++){
            //spaces
            for (int s=1; s<=(n-i); s++){
                System.out.print(" ");
            }
            //Stars
            //star will be print till (2i-1) using this formula
            for (int j=1; j<=2*(i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half

        for (int i=n; i>=1; i--){
            //spaces
            for (int s=1; s<=(n-i); s++){
                System.out.print(" ");
            }
            //Stars
            //star will be print till (2i-1) using this formula
            for (int j=1; j<=2*(i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond(3);
    }
}
