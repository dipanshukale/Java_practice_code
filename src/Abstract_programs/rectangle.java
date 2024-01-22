package Abstract_programs;

import java.util.Scanner;

public class rectangle extends Shape {

    public void Read_length_breadth() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Length & Breadth");
         lengths = scan.nextDouble();
         breadth = scan.nextDouble();
        System.out.println("Your Length is " +lengths+ " & Your Breadth is "+breadth);
        System.out.println();

    }

    @Override
    public void Area() {

        double v = lengths * breadth;
        System.out.println("Your Area of Rectangle is : "+v);
        System.out.println();
    }

    @Override
    public void perimeter() {

        double p = 2*(lengths+breadth);
        System.out.println("Your Perimeter of Rectangle is : "+p);

    }
}
