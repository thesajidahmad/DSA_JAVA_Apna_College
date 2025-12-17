package Function;
import java.util.*;

public class ProductOfTwo {

    public static void ProductOfTwoNum(int a, int b){
        int mul = a*b;
        System.out.println("a * b: "+mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        ProductOfTwoNum(a, b);
        sc.close();
    }
}
