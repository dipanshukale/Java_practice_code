package DSA_practice;

public class Search_sorted_matrix_in_2D {
    public static boolean Search(int[][] matrix, int key){
        //for lastCol we take i.e (0,m-1);
        int row =0, col= matrix[0].length-1;

        while ( row < matrix.length && col >=0){

            if (matrix[row][col] == key ){
                System.out.println("Key is found at ("+ row + ","+ col+")");
                return true;
            } else if (key< matrix[row][col]) {
                col--;
            }else {
                row++;
            }
        }
        System.out.println("Key not found !");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix =
                                 {{10,20,30,40}
                                 ,{15,25,35,45}
                                 ,{27,29,37,48},
                                 {32,33,39,50}};
        int key = 33;

        //function call
        boolean element = Search(matrix,key);
        System.out.println("Your Element is "+ key +" "+"is "+element);
    }
}
