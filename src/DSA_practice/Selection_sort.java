package DSA_practice;

public class Selection_sort {
    public  static void Selection(int[] arr){
        for (int i=0; i< arr.length-1; i++){

            int minPos = i;

            for (int j=i+1; j< arr.length; j++){

                if (arr[minPos] > arr[j]){ //compare until we get a min no. i.e = 5 > 4 ....
                    minPos = j;  // update minPos when  comparison is true
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    //print arr
    public static void PrintArr(int[] arr){
        System.out.println("Your Sorted Elements Are : ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    //main function
    public static void main(String[] args) {

        int[] Selection = {5,4,1,3,2};

        //function call
        Selection(Selection);
        //print arr
        PrintArr(Selection);


    }
}
