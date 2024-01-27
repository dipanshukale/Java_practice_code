package DSA_practice;

public class Diagonal_sum {

    //brute force method (time complexity 0(n^2) ).
    public static int Diagonal(int[][] matrix){
        int sum=0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (i==j){
                    sum += matrix[i][j];
                } else if (i+j== matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }

    //optimized code for diagonal sum (time complexity is 0(n) ).

    public static int Optimized(int[][] matrix){
        int sum=0;
        for (int i=0; i< matrix.length; i++){
            //primary diagonal
            sum+= matrix[i][i];

            //secondary diagonal
            if (i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9},};

        //bruteForce method function call
//        int sum = Diagonal(matrix);

        //optimized function call
       int sum =  Optimized(matrix);

        System.out.println("Sum Of Diagonal Elements is : "+sum);
    }
}
