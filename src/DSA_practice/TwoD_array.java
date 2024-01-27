package DSA_practice;

import java.util.Scanner;

public class TwoD_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] [] matrix = new int[3][3];

        int n=3, m=3;

        //for input
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        //output

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
