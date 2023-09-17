package Two_D_array_Z_sum;

import java.util.Scanner;

public class Sum_in_Z_pattern {
    public static void main(String[] args) {
        int value = 0, sum = 0, diag = 0;
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter array numbers : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.nextInt();

            }

        }

        System.out.println("Your Array is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();

        }



         // Top row
        for (int j=0; j<2; j++){

            value = value + arr[0][j];


        }

            // Bottom row
         for (int j =1; j<3; j++){
             value = value+arr[2][j];
         }


         //Diagonal Elements
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {


                if ((i + j) == (2)) {
                    diag = diag + arr[i][j];
                }


            }

        }
        // sum of top+bottom+diagonal = Z pattern sum
           sum = sum+ diag+value;
        System.out.println("your sum is : "+sum);
    }
}

