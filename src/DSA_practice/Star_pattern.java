package DSA_practice;

public class Star_pattern {
//    public static void main(String[] args) {
//        //outer Loop
//        for (int line =0; line< 11; line++){
//
//            //inner loop
//            for (int star =1; star<=line; star++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }

    //-------------- inverted pattern -----------------
//    public static void main(String[] args) {
//        for (int line=1; line<5; line++){
//
//            for (int star=1; star< 5-line+1 ; star++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }

    //-------------- half-pyramid -----------------

//    public static void main(String[] args) {
//        for (int line =1; line<5; line++){
//
//            for (int star=1; star<=line; star++){
//
//                System.out.print(star+ " ");
//
//            }
//            System.out.println();
//        }
//    }


    //------------print Character patter-----------


    public static void main(String[] args) {
        char ch = 'A';
        for (int line=1; line<5; line++){

            for (int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }






}
