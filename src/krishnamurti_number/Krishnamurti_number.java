package krishnamurti_number;

import java.util.Scanner;

public class Krishnamurti_number {
    public static void main(String[] args) {
        int sum, num, value = 0, fact,cal=0, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Number : ");
        num = scan.nextInt();
        temp = num;

        while(num>0) {
            sum = (num % 10);

            fact = 1;

            for (int i = 1; i<=sum; i++) {
                fact = fact * i;
                

            }

            value = value + fact;
            num = (num / 10);

        }
         if (temp == value){
             System.out.println("Your number is Strong number : "+value);
         }else {
             System.out.println("your number is not a Strong number ");
         }
    }
}
