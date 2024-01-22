package DSA_practice;

public class Sub_of_Arrays {
    public static void Sub_ofArrays(int[] num){
        int Total_sub = 0;
        int largest = Integer.MIN_VALUE; int Smallest  = Integer.MAX_VALUE;
        for (int i=0; i< num.length; i++){
            //int start = i;
            for (int j=i;j< num.length; j++){
                //int end = j;
                int sum =0;

                for (int k=i; k<=j; k++){ //print sub Array

                     sum = sum +  num[k];
                    System.out.print(num[k]+ " ");

                }
                Total_sub++;
                if (sum > largest){
                    largest = sum;
                }if (sum < Smallest) {
                    Smallest = sum;
                }
                System.out.print("    Sum :-" +sum);

                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Sub Arrays are : "+Total_sub);
        System.out.println("Largest Sum of Sub Array is :  "+largest);
        System.out.println("Smallest sum of Sub Array is : "+Smallest);

    }

    public static void main(String[] args) {
        int[] Array = {1,-2,6,-1,3};

        //function Call
        Sub_ofArrays(Array);
    }
}
