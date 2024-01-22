package Abstract_programs;

import java.util.Scanner;

public class Circle extends Shape {

    public void read_radius() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Radius : ");
        radius = scan.nextDouble();
        System.out.println("Your radius Of Circle  is : " + radius);
        System.out.println();
    }

    @Override
    public void Area() {
        double area = 3.14 * (radius * radius);
        System.out.println("Your Area of circle is : " + area);
        System.out.println();
    }

    @Override
    public void perimeter() {

        double r = 2 * 3.14 * radius;
        System.out.println("Your Perimeter of circle is : " + r);
    }


}



