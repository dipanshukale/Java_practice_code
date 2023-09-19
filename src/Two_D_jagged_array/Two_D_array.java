package Two_D_jagged_array;

import java.util.Scanner;

public class Two_D_array {
    public static void main(String[] args) {
        int n,r,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Two-D-Jagged Array Length : ");
        n = scan.nextInt();

        int [][][] jagged = new int[n][][];

        for (int i =0; i< jagged.length; i++){

            System.out.println("Now, You are at "  +i+ "th" +" " +"index of Jagged Array ");
            System.out.println("Enter a row of  jagged array ");
            r= scan.nextInt();
            System.out.println("Enter a col of jagged array ");
            c = scan.nextInt();
            jagged[i] = new int [r][c];
            for (int j =0; j< jagged[i].length; j++){


                for (int k=0; k< jagged[i][j].length; k++){

                }
            }
        }


        System.out.println("your Two-D_Jagged Array is : ");

        for (int i =0; i< jagged.length; i++){


            for (int j =0; j< jagged[i].length; j++){


                for (int k=0; k< jagged[i][j].length; k++){

                    System.out.print(jagged[i][j][k]+" \t");

                }
                System.out.println();
            }
            System.out.println();
        }












    }
}
