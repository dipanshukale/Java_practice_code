package count;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int num, count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The number : ");
        num = scan.nextInt();

        while(num>0){
            count++;
            num = (num/10);

        }
        System.out.println("The total digit is : "+count);
    }
}
