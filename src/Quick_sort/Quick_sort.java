package Quick_sort;

import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        int n, pivot = 0, count, s, temp = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array length : ");
        n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            pivot = arr[arr.length - 1];

        }
        System.out.println("your pivot element is " + pivot);


        for (int i = 0; i < arr.length; i++) {

            int j =i-1;
                if (arr[i] < pivot) {
                    j++;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

                j++;
                temp = arr[j];
                arr[j] = pivot;
                arr[arr.length - 1] = temp;

        }




        for (int i=0; i< arr.length; i++) {


            System.out.println(arr[i]+" ");



        }


//
//
//

//        for (int i=0; i< arr.length; i++){
//
//            System.out.print(arr[i]+" ");
//        }
////
//
//        System.out.print("largest element than pivot  :");
//        int j=0;
//        for (int i =0; i< arr.length;i++){
//            if(arr[i]<pivot){
//
//            }
//
//            j++;
//        }
//
//        for (int i =0; i<pivot; i++){
//            if (arr[i]<pivot){
//                break;
//            }
//
//        }
//
//
//


    }
}
