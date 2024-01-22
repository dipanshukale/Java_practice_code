package DSA_practice;

public class Bubble_Sort {
    //Logic of Bubble Sort Implementation
    public  static void BubbleSort(int[] sort){
        for (int turn=0; turn< sort.length; turn++){
            //inner loop
            for (int j=0; j< sort.length-1-turn; j++){
                if (sort[j] > sort[j+1]){
                    int temp = sort[j+1];
                    sort[j+1] = sort[j];
                    sort[j] = temp;
                }
            }
        }
    }

    //for printing Array
    public  static void PrintArr(int[] Arr){
        System.out.println("Your Sorted Array is : ");
        for (int i=0; i< Arr.length; i++){
            System.out.print(Arr[i]+ " ");
        }
        System.out.println();
    }


    //main function
    public static void main(String[] args) {
        int[] BubbleArray = {5,4,1,3,2};

        //function call
        BubbleSort(BubbleArray);
        //function call for print Array
        PrintArr(BubbleArray);
    }
}
