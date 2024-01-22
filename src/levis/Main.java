package levis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Enter 1 for brand levis shop :\n2. Enter 2 for CRPF_shop :  ");
        int n = scan.nextInt();

        s_levi s = new s_levi();
        C_pant c = new C_pant();


        if (n == 1)
        {
            System.out.println(" You are at Brand levis we have Denim jeans only   : " );
            s.show();

        } else if ( n == 2)
        {

            System.out.println("Now, you at CRPF_levis shop : \n 1. For ribbed jeans\n 2. for baggy jeans\n 3. For denim jeans");
            int r = scan.nextInt();

            if (r == 1){
                c.Show_jeans();
            }
            else if ( r == 2 ) {

                c.show_baggy();
            }
            else {
                c.show_parent();
            }
        }
        else {
            System.out.println("Sorry! Re-Enter value");
        }




    }
}
