package DSA_practice;

import java.util.Scanner;

public class Linear_Search {

    public static int LinearSearch(int[] num, int key){

        for (int i=0; i< num.length; i++){

            if (num[i] == key){
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        //input array size
        System.out.println("Enter Your Array Size: ");
        int size = Scan.nextInt();
        int [] num = new int[size];

        //input array elements
        System.out.println("Enter Your Array Numbers : ");
        for (int i =0; i<num.length;i++){
            num[i] = Scan.nextInt();
        }

        //input key
        System.out.println("Enter Your Key : ");
        int key = Scan.nextInt();

        //Function Call
        int index = LinearSearch(num,key);
        if (index == -1){
            System.out.println("Not Found");
        }else {
            System.out.println("Key is at index  "+index);
        }





    }
}
