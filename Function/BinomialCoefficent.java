package Function;
import java.util.*;

public class BinomialCoefficent {

    public static int factorial(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int bincoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binomialcoff = fact_n/(fact_r*fact_nmr);
        return binomialcoff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n: ");
        int n = sc.nextInt();

        System.out.print("r: ");
        int r = sc.nextInt();

        // factrial of n
        int fact = factorial(n);
        System.out.println("Factorial of n: "+fact);
        
        // BinomialCoefficent of n and r
        System.out.println("Binomial Coefficent of n and r: "+bincoff(n, r));
        // System.out.println("Factorial of n: "+fact);

        sc.close();
    }
}