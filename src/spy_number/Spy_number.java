package spy_number;

import java.util.Scanner;

public class Spy_number {
    public static void main(String[] args) {
        int num, sum =0,curr, value =1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your spy number : ");
        num = scan.nextInt();

        while(num>0){
            curr = (num%10);
            sum = sum+curr;
            num =(num/10);

            value = (value*curr);

        }
        if(value == sum ){
            System.out.println("your Number is spy number ");
        }else {
            System.out.println("This is not a spy number ");
        }
    }
}
