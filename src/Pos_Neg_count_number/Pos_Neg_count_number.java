package Pos_Neg_count_number;

import java.util.Scanner;

public class Pos_Neg_count_number {
    public static void main(String[] args) {
        int num, sum = 0, neg = 0, count = 0,zero = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Please Enter Your Number : ");
            num = scan.nextInt();

            if (num > 0) {
                    count++;
            } else if ((num == -1 )) {
                break;

            } else if (num<0) {

                neg++;
            }else{
             zero++;
            }

        }while(num != -1);{
            System.out.println(" Opp's Sorry !");
        }


        System.out.println(" Your Positive Number's Are : "+count);
        System.out.println(" Your Negative  Number's Are : "+neg);
        System.out.println(" Your Zero  Number's Are : "+zero);


        }
    }

