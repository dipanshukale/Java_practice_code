package Insertion_sort;

import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        int size,temp, value;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array Size :  ");
        size = scan.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Your Array numbers : ");
        for (int i =0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }


        for ( int i =1; i< arr.length; i++){
            temp = arr[i];
            int j = i-1;
            for (; j>=0; j--){
                if (arr[j]> temp){
                    arr[j+1]= arr[j];
                }else {
                    break;
                }
            }

            arr[j+1]= temp;


        }
        System.out.print("Your sorted Array is :  ");
        for (int i =0; i<arr.length; i++){
            value = arr[i];
            System.out.print(value+ " ");
        }


    }
}
