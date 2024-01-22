package DSA_practice;

public class Kadanes_Algo_Optimized_MaxSubArray {

    public  static void Kadnes_algo(int num[]){
        int MaxSum = Integer.MIN_VALUE;
        int MinSum = 0;
        int CurrentSum = 0;

        for (int i=0; i< num.length; i++){
            CurrentSum = CurrentSum + num[i];
            if (CurrentSum < 0){

                CurrentSum = 0; // we neglect -ve value instead of -ve we take 0

            }


            MaxSum = Math.max(CurrentSum, MaxSum);
        }
        System.out.println("Max Sum of SubArray is : "+MaxSum);

        //for smallest
        for (int j=0; j< num.length; j++) {
            CurrentSum = CurrentSum + num[j];
            if (CurrentSum < 0) {
                MinSum = CurrentSum;
            }

        }

        System.out.println("Min Sum of SubArray is : "+MinSum);

    }

    public static void main(String[] args) {
        int[] Array = {-4,3,-2,1};

        //function call
        Kadnes_algo(Array);
    }


}
