package DSA_practice;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Binary_Search {
    public  static int BinarySearch(int[] num, int key){
        int start =0, end = num.length-1;

        while(start <= end){
            int mid = (start+end) / 2;

            //comparison
            if (num[mid] == key){   //for mid
                return mid;
            }if (num[mid] < key){  // for right
                start = mid+1;
            }else {
                end = mid-1;  //for left
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        //read array size
        System.out.println("Enter Your Array size :- ");
        int size = Scan.nextInt();

        int[] ArraySize = new int[size];

        //elements Read
        System.out.println("Enter Your Array Elements In sorted Order : ");
        for (int i=0; i< ArraySize.length; i++){
            ArraySize[i] = Scan.nextInt();
        }

        //key
        System.out.println("Enter Your key for Search an Element : ");
        int key = Scan.nextInt();

        //function Call
        int Found =  BinarySearch(ArraySize,key);
        if (Found == -1){
            System.out.println("Key Not Exist");
        }else {
            System.out.println("Element Found At index : "+Found);
        }



    }
}
