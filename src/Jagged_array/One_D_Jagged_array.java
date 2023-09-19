package Jagged_array;

import java.util.Scanner;

public class One_D_Jagged_array {
    public static void main(String[] args) {
        int n,k;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your jagged Array Length : ");
        n = scan.nextInt();

          int[][] jagged = new int[n][];

        for (int i=0; i< jagged.length; i++){
            System.out.println("Enter Length at index  : "+i);
            k = scan.nextInt();
            jagged[i] = new int[k];


            for (int  j =0; j<jagged[i].length; j++){

                // jagged Array I'll print at each index.
            }
            System.out.println();
        }


        System.out.println("Your Jagged Array is : ");
        for (int i=0; i< jagged.length; i++){

            for (int  j =0; j<jagged[i].length; j++){
                System.out.print(jagged[i][j]+ "\t");
            }
            System.out.println();
        }





    }
}
