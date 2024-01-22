package DSA_practice;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
      int reverse = 0;
        Scanner Scan = new Scanner(System.in);


        System.out.println("Enter Your number :- ");
        int  n = Scan.nextInt();

       while (n > 0){
           int lastdigit = n % 10;
           reverse = (reverse*10)+lastdigit;
           n = n/10;

       }
        System.out.println("Your reverse Number is :-" +reverse);


    }
}
