package Replace_element_with_new;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        int num, element,user, value;
         int arr[] = new int[10];

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Array Numbers : ");


        for (int i = 0; i< 10; i++){
            arr[i] = scan.nextInt();


        }

        System.out.println("Enter same Number :  ");
        user = scan.nextInt();
        System.out.println("Enter new-element : ");
        element = scan.nextInt();

        for (int i =0; i<10; i++) {

            if (arr[i] == user){



                arr[i]= element;
                System.out.println(arr[i]);

            } else if (arr[i] != user) {

                System.out.println(arr[i]);



            }


        }
       

    }
}

