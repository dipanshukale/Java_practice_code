package Happy_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, value = 0, count = 0, n =0, sum =0, h=0, val;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        num = scan.nextInt();
int i = num;
        while(num > 0){
            value = num% 10;
            sum = sum+(value*value);
            num = num/10;

        }
        while (sum > 0){
            count = sum%10;
            n = n+count;
            sum = sum/10;

        }
        if (n == 1){
            System.out.println("Here is Your Happy Number : "+i);
        }else {
            System.out.println("Sorry ! This is Unhappy number : "+i);
        }





    }
}
