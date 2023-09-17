package Linear_search;

import java.util.Scanner;


public class Linear_search {
    public static void main(String[] args) {
        int size, value;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Array Length : ");
        size = scan.nextInt();
          int[] arr = new int[size];

        System.out.println("Enter your array Numbers : ");
        for (int i =0; i<arr.length; i++){
           arr[i]= scan.nextInt();
        }
        System.out.println("Enter Target Number : ");
        value = scan.nextInt();

        for (int  i = 0; i< arr.length; i++){

            if (arr[i] == value) {
                System.out.println("Your target is found at index" + " " +i + " & your Target is  " +arr[i]);
            }
        }


    }
}
