package largest_number_in_array;

import java.util.Scanner;

public class largest_array_num {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int value = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Numbers : ");

        for (int i =0; i<5; i++){
            arr[i] = scan.nextInt();
            if (arr[i] > value){
                value = arr[i];
            }
        }
        System.out.println("Your Largest Number Array No. is : "+value);
    }
}
