package DSA_practice;

public class spiral_Matrix {

    public static void Spiral(int[][] matrix){
        int startRow=0;
        int startCol=0;
        int endRow= matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol<= endCol){
            //top
            //for col i have taken j

            for (int j= startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            //for row i have taken i
            for (int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for (int j=endCol-1; j>=startCol; j--){
                if (startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for (int i=endRow-1; i>=startRow+1; i--){
                if (startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }


            //for inner boundary we have to iterate written a logic in notebook
            startRow++;
            startCol++;
            endRow--;
            endCol--;


        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix =
                {{1,2,3},
                {4,5,6},
                {7,8,9}};

        Spiral(matrix);
    }
}
