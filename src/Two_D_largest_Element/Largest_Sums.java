package Two_D_largest_Element;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_Sums {
    public static void main(String[] args) {
        int r;
        int c;
        int l=0;
        int sum =0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Rows & Column : ");
        r = scan.nextInt();
        c = scan.nextInt();

        int [][] arr = new int [r][c];
        int value = 0;


        System.out.println("Enter Array : ");
        for (int i = 0; i<r; i++){
            for (int j=0; j<c; j++){
                arr[i][j] = scan.nextInt();
            }
        }


        System.out.println("Your Array is : ");
        for (int i = 0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }


        for (int i =0; i<r; i++) {

            Arrays.sort(arr[i]);
            value = value+arr[i][c-1];



        }

        System.out.println("Sum of largest element of each row is : "+value);
    }
}
