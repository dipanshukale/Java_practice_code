package armstrong_number;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        int num ,value, count = 0, numcopy, store, digit = 0;
        double sum  =0;
        String n;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number's : ");
        n = scan.next();
        num = Integer.parseInt(n);
        numcopy = num;
        digit = n.length();

//        while(num>=0){
//            count++;
//            num = (num/10);
//            value = count;
//        }

            while(num>0){
                store = num%10;
                double cube = Math.pow(store,digit);
                sum = (sum+cube);
                num = (num/10);
            }


        if (sum==numcopy){
            System.out.println("Your number Is ArmStrong Number : "+sum);
        }else {
            System.out.println("This Is Not a ArmStrong Number.");
        }












    }
}
