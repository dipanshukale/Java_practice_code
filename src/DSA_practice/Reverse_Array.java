package DSA_practice;

import java.util.Scanner;

public class Reverse_Array {
    public  static void reverse(int[] num){
        int first =0 ,last = num.length-1;

        while (first < last){
            //swap
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }


    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        //read array size
        System.out.println("Enter Your Array size :- ");
        int size = Scan.nextInt();

        int[] ArraySize = new int[size];

        //elements Read
        System.out.println("Enter Your Array Elements :  ");
        for (int i=0; i< ArraySize.length; i++){
            ArraySize[i] = Scan.nextInt();
        }


        //function call
       reverse(ArraySize);

        //reverse Array printed
        System.out.println("Your Reverse Array is : ");
       for (int i=0; i< ArraySize.length; i++){
           System.out.print(ArraySize[i]+ " ");
       }
    }
}
