package Bubble_sort;

import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        int n, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a array length  : ");
        n = scan.nextInt();
        int []arr= new int[n];

        //input Numbers
        System.out.println("Enter Your Numbers : ");
        for (int i=0; i< arr.length; i++){
            arr[i] = scan.nextInt();

        }


        //bubble sort
        for (int i = 0; i< arr.length-1; i++){

            for (int j=0; j< arr.length-i-1; j++){

                if (arr[j] > arr[j+1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        //Sorted array
        System.out.println("your Sorted Array is : ");
        for (int i = 0; i< arr.length; i++) {
            System.out.print(" " + arr[i]);

        }


    }
}
