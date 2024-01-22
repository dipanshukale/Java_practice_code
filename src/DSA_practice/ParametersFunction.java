package DSA_practice;

public class ParametersFunction {
    public static  void CalculateSum(int a, int b){

        int sum = a+ b;
        System.out.println("sum is : "+sum);

    }

    public  static int Product(int a, int b){
        int multiply = a*b;
        return multiply;
    }

    public  static int Factorial(int n){
        int fact=1;

        for (int i=1; i<=n; i++){
            fact = fact*i;

        }
        return fact;
    }

    public  static  int binCoeff(int n, int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);

        int BinomialCoeff = fact_n / (fact_r * fact_nmr);

        return BinomialCoeff;
    }

    public static void main(String[] args) {


    int BinomialCoeff = binCoeff(5,2);
        System.out.println("Binomial Coefficient of value is : "+BinomialCoeff);



    }
}
