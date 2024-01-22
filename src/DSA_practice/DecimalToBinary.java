package DSA_practice;

public class DecimalToBinary {

    public  static void DecToBin(int n){
        int myNum = n;
        int pow = 0;
        int BinNum = 0;

        while (n>0){
            int rem = n % 2;
            BinNum = (int) (BinNum + (rem * Math.pow(10, pow)));
            pow++;

            n = n/2;
        }

        System.out.println("Binary Form of " +myNum + " = "+BinNum );


    }
    public  static void BinToDec(int n){
        int BinNum = n;
        int pow=0;
        int  decNum = 0;

        while(n > 0 ){

            int lastDigit = n % 10;

            decNum = (int) (decNum + (lastDigit * Math.pow(2, pow)));
            pow++;

            n = n/10;
        }
        System.out.println("Binary to Decimal "+BinNum+ " = "+decNum);
    }



    public static void main(String[] args) {
       BinToDec(1101);
    }

}
