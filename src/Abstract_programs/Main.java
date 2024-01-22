package Abstract_programs;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.read_radius();
        c.Area();
        c.perimeter();

        rectangle r = new rectangle();
        r.Read_length_breadth();
        r.Area();
        r.perimeter();
    }
}
