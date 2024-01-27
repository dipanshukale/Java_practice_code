package DSA_practice;

public class Insertion_sort {
    public  static void Insertion(int[] arr){
        for (int i=1 ;i< arr.length; i++){
            int curr = arr[i];
            int  prev = i-1;
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];

                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void PrintArr(int[] arr){
        System.out.println("Your Sorted Array is : ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }


    //main
    public static void main(String[] args) {

        //unsorted Array
        int[] array = {5,4,1,3,2};

        //function call
        Insertion(array);

        //print Array
        PrintArr(array);
    }
}
