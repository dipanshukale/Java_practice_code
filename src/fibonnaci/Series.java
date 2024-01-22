package fibonnaci;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter Nth value of fib_series series : ");
        int f = scan.nextInt();

        int fib , v1 = 0, v2 = 1;
        for (int i =2; i<=f; i++){
            fib = v1+v2;
            v1 = v2;
            v2= fib;
            System.out.println(" "+fib);
        }
    }
}
