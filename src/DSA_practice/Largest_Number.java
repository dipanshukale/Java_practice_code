package DSA_practice;

import java.util.Scanner;

public class Largest_Number {

    public  static  int  GetLargestNumber(int num[]){
        int largest = Integer.MIN_VALUE;

        for (int i=0; i< num.length; i++){
            if (largest < num[i]){
                largest = num[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        //array size read
        System.out.println("Enter Your Size Of Array : ");
        int size = Scan.nextInt();

        //array size
        int[] ArraySize = new int[size];

        System.out.println("Enter Your Array Numbers : ");
        for (int i=0; i< ArraySize.length; i++){
            ArraySize[i] = Scan.nextInt();
        }

        //function call
        int largest = GetLargestNumber(ArraySize);
        System.out.println("Largest Number is : "+largest);
    }
}
