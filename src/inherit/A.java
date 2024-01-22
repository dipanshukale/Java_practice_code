package inherit;

public class A {

    //parametrized constructor
    public A(int i, int l){

        int c = i*l;
        System.out.println("Your supper class multiplication is :- "+c);
    }

     public void Show() {

        for (int i=2 ; i<5; i++){
            if (i%2==0){
                System.out.println("Your Even numbers are :  "+i);
            }else {
                System.out.println("Your Odd numbers are : "+i);
            }
        }

    }


}

