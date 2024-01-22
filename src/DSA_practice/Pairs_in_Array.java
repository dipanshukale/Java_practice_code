package DSA_practice;

import java.util.Scanner;

public class Pairs_in_Array {
    public static void Pairs_of_Elements(int[] num){
        int Total_pairs= 0;
        for (int i=0; i<= num.length-1; i++){
            int curr = num[i];
            for (int j= i+1; j< num.length; j++){
                System.out.print("( "+curr+","+num[j]+" )");
                Total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs Are : "+Total_pairs);

    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int Size = Scan.nextInt();

        //Array size Read
        int[] Array_Size = new int[Size];

        //Enter Array elements
        System.out.println("Enter Your Array Elements : ");
        for (int i=0; i< Array_Size.length; i++){
            Array_Size[i] = Scan.nextInt();
        }

        //Function Call
        System.out.println("Your Pairs Of Elements Are : ");
        Pairs_of_Elements(Array_Size);

    }
}
