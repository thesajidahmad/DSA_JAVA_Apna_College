package Function;

public class isPrimeInRange {


    public static void IsPrimeInRange(int n){
        for(int i =2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i = 2; i <= n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        // System.out.println(isprime(2));
        IsPrimeInRange(100);
    }
}