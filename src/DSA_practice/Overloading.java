package DSA_practice;

public class Overloading {
    public static int sum(int a , int b){
        return a*b;
    }

    public  static  int sum(int a, int b, int c){
        return a + b + c;
    }


    public static void main(String[] args) {
        System.out.println("Product of two numbers :- "+sum(2,3));
        System.out.println("Sum of Two Numbers :- "+sum(2,3,4));


    }
}
