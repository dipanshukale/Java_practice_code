package Two_D_array_Z_sum;

import java.util.Scanner;

public class Sum_in_Z_pattern {
    public static void main(String[] args) {
        int value = 0,num;
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter array numbers : ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                arr[i][j]= scan.nextInt();

            }

        }


        System.out.println("Your Array is : ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(arr[i][j]+ "\t");

            }
            System.out.println();

        }



        for (int i =0; i<3; i++){

            for (int j =0; j<3; j++){

                if ((i == 1 && j == 2)){
                  break;
                }else {
                    value = value +arr[i][j];
                }

            }

        }
        System.out.println("sum is : "+value);
    }
}
