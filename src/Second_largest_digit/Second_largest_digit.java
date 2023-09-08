package Second_largest_digit;

import java.util.Scanner;

public class Second_largest_digit {

    public static void main(String[] args) {
      int large, value, second = 0, digit = 0, num;
     Scanner scan = new Scanner(System.in);
     System.out.println("please Enter Your Number : ");
     num = scan.nextInt();

      while(num>0){
           large = (num%10);


           if (large>digit){
                second = digit;
              digit = large;
           } else if ((large>second && second<large)) {
               second = large;
           }

           num = (num/10);
      }
        System.out.println("Your largest digit is : "+digit);
      System.out.println("Your second largest digit is : "+second);






    }
}
