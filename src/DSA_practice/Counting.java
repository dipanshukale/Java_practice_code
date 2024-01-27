package DSA_practice;

public class Counting {
    public static void Counting_sort(int[]arr){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        System.out.println(largest);

        //count Array
        int[] Count = new int[largest+1];

        for (int i=0; i<arr.length; i++){
            Count[arr[i]]++;

        }

        //sorting

        int j=0;
        for (int i=0; i< Count.length; i++){
            while (Count[i] > 0){
                arr[j] = i;
                j++;

                Count[i]--;
            }
          
        }
    }

    //print arr
    public static void PrintArr(int[] arr){
        System.out.println("sorted array : ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};

        //function Call
        Counting_sort(arr);

        PrintArr(arr);

    }
}
