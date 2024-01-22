package overriding;

public class B extends A {

    public void show(){
        super.show();
        System.out.println("B is showing");

    }

    void display(){
        System.out.println("Display is showing");
    }
}
