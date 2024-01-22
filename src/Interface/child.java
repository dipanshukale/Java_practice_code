package Interface;

public class child implements show1,show2 {

    @Override
    public void detail() {

    }

    @Override
    public void color() {
        System.out.println("hh");
    }

    @Override
    public void move() {
        show1.super.move();
        show2.super.move();
    }
}
