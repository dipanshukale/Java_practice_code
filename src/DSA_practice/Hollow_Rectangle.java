package DSA_practice;

public class Hollow_Rectangle {
    public  static  void Hollow_rectangle(int totRows, int totCols){

        //outer loop
        for (int i=1; i<=totRows; i++){
            //inner loop

            for (int j=1; j<=totCols; j++){

                if (i==1 || i == totRows || j==1 || j==totCols){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Hollow_rectangle(15,8);
    }
}
