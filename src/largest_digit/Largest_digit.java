package largest_digit;

import java.util.Scanner;

public class Largest_digit {
    public static void main(String[] args) {
        int num, curr, value =0, sum, second ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a  Number  : ");
        num = scan.nextInt();

        while(num>0){
            curr = (num%10);


            if ((curr > value)) {
                value = curr;


            }

        }
        System.out.println("The largest Number is : "+value);
        System.out.println();




    }
}
