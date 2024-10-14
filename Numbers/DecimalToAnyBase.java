package Numbers;

import java.util.Scanner;

public class DecimalToAnyBase {
    /*
    Constraints: 
     *  0 <= n <= 512
     *  2 <= base <= 10
     */

    public static void display(long out) {
        System.out.println(out);
    }

    public static long decimalToAnyBaseConversion(int n, int base) {
        int power = 0;
        long out = 0;
        while(n != 0) {
            int rem = n % base;
            out += rem * (int)Math.pow(10, power ++);
            n = n/base;
        }
        return out;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int base = scan.nextInt();
        scan.close();
        long out = decimalToAnyBaseConversion(n , base);
        display(out);
        return ;
    }
}
