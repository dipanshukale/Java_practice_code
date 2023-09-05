package sums_of_digits;

import java.util.Scanner;

public class Sums_of_digits {
    public static void main(String[] args) {
        int num, curr, sum =0 ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Numbers : ");
        num = scan.nextInt();

        while(num>0){
            curr = (num%10);
            sum = sum+curr;

            num =(num/10);
        }
        System.out.println("Sum of digit's is : "+sum);
    }
}
