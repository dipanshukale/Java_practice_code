package armstrong_number;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        int num , sum, curr, value, count = 0, digit = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number's : ");
        num = scan.nextInt();

        while(num>0){
//            count++;
//            num = (num/10);
////            value = count;

            curr = (num%10);




            digit = digit+(curr*curr*curr);
            num = (num/10);
          }


        System.out.println(digit);









    }
}
