package Function;

public class binary_to_decimal{
    public static void binToDec(int binNum){
        int myName = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum>0) {
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow ++;
            binNum = binNum/10;

        }
    System.err.println("Decimal of  "+myName+" = "+decNum);

    }
    public static void main(String[] args){

        binToDec(101);
    }
}