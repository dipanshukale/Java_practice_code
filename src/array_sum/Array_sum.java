package array_sum;

import java.util.Scanner;

public class Array_sum {

    public static void main(String[] args) {

       int sum = 0;
        int arr[] = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("please Enter Your Array No. : ");

        for (int i =0; i<5; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Your Array is : ");
         for (int i =0; i<5; i++){
             System.out.println(arr[i]);
             sum = sum+arr[i];
         }
        System.out.println(" Your Array's sum is : "+sum);
    }
}
