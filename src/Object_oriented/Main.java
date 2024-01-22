package Object_oriented;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length, breadth;

        System.out.println("Enter Your length : ");
        length = scan.nextDouble();
        System.out.println("Enter Your Breadth : ");
        breadth = scan.nextDouble();
        Area r = new Area();
        System.out.println("Your Area is : "+r.React(length,breadth));
        System.out.println("Your Perimeter is : "+r.peri(length,breadth));





    }
}
