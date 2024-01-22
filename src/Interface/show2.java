package Interface;

public interface show2 {

    public void color();
    default  void move(){
        System.out.println("Please move from A to B ");
    }
}



