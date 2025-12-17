package Function;
import java.util.*;

public class sumOfTwo {


    public static void SumOfTwoNum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        //Sum Of Two Number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        SumOfTwoNum(a,b);

        sc.close();
    }
}
