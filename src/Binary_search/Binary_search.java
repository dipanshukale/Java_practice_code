package Binary_search;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int size, num, left = 0, value;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Array Length : ");
        size = scan.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter your array Numbers : ");
        for (int i =0; i<arr.length; i++){
            arr[i]= scan.nextInt();
        }
        System.out.println("Enter Target Number : ");
        value = scan.nextInt();

//        System.out.println("L.H.S");

        for (int  i = 0; i< arr.length/2; i++){

//            left = arr[i];
//            System.out.println(left+" ");


            if (arr[i] == value) {
                System.out.println("Your target is found at index" + " " +i + " & your Target is  " +arr[i]);
            }
        }





        //binary search : implementation


//        System.out.println("R.H.S");


        for (int j = arr.length/2; j< arr.length; j++){

            if ( arr[j] == value){
                System.out.println("your target is found at index" + " " + j + " & your Target is "+arr[j]);
            }


        }

    }
}
