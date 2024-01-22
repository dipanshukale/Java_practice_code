package inherit;

public class B extends A {
    public B(int i, int l,int j) {
        super(i,l);
        System.out.println("your Subclass is here! "+j);
    }

    public void display(){

        System.out.println("Display method");
    }
}
