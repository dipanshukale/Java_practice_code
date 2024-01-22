package DSA_practice;

public class Optimized_sol_for_MaxSubArray_prefix {
    public static void Sub_ofArrays(int[] num){
        int Currsum;
        int largest = Integer.MIN_VALUE;
        int[] prefix = new int[num.length];

        //calculate  prefix array
        prefix[0] = num[0];
        for (int i=1; i< prefix.length; i++){
              prefix[i] = prefix[i-1] + num[i];//sum of  sub elements
        }


        for (int i=0; i< num.length; i++){
            //int start = i;
            for (int j=i;j< num.length; j++){
                //int end =j;

                Currsum = i == 0 ?  prefix[j] : prefix[j] - prefix[i -1];//formula for calculating Sum.


                if (largest < Currsum){
                    largest = Currsum;
                }

            }
        }
        System.out.println("Largest Sum of Sub Array is :  "+largest);


    }

    public static void main(String[] args) {
        int[] Array = {1,-2,6,-1,3};
        Sub_ofArrays(Array);
    }

}
