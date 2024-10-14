package Day1;

import java.util.Scanner;

public class isPrime {

    public static String primeFn(int n) {
        if(n < 2) {
            return "Not Prime";
        }
        for(int j = 2; j*j<=n; j ++) {
            if(n % j == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of tests: ");
        int tests = scan.nextInt();

        for(int i=0; i<tests; i ++) {
            int n = scan.nextInt();
            System.out.println(primeFn(n));
        }
    }
}
