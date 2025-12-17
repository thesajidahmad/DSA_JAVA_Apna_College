package Pattern;
public class half_pyramid {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/*
Output:
1
12
123
1234

*/