package DSA_practice;

public class Inverted_half_pyramid {

    public  static  void Inverted_pyramid(int n){

        //outer
        for (int i=1; i<=n; i++){
            //inner loop

            //spaces loop
            for (int s=1; s<=n-i; s++){
                System.out.print(" ");

            }

            //star loop

            for (int star =1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    //inverted_pyramid with numbers

    public  static void pyramid_with_numbers(int n){

        for (int i=1; i<=n; i++){
            //inner loop
            for (int num=1; num<=n-i+1; num++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       pyramid_with_numbers(7);
    }

}
