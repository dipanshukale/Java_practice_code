package Quick_sort;

import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        int n, pivot =0, count = 0,s, temp=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array length : ");
        n = scan.nextInt();

        int []arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i =0; i< arr.length; i++){
            arr[i] = scan.nextInt();
        }

        for (int i =0; i< 1; i++){
            pivot = arr[i];
            System.out.println(pivot);
        }


        System.out.println("your No. less than pivot are : ");
        for (int i=0; i< arr.length; i++){
            if (arr[i]<pivot){
                count++;



            }



        }
        System.out.println(count);

        for (int i=0; i< arr.length; i++){
            s = count;
            temp = arr[0];
            arr[0]= arr[s];
            arr[s]= temp;

            System.out.print(arr[i]+" ");
        }
        System.out.println();
//
//        System.out.print("largest element than pivot  :");
//        for (int i =0; i< arr.length;i++){
//            if (arr[i]>pivot){
//                System.out.print(" "+arr[i]);
//            }
//        }

        for (int i =0; i<pivot; i++){
            if (arr[i]<pivot){
                break;
            }

        }





    }
}
