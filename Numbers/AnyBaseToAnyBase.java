package Numbers;

import java.util.Scanner;

public class AnyBaseToAnyBase {

    /*
     * Constraints: 
     *  0 <= n <= 512
     *  2 <= b1 <= 10
     *  2 <= b2 <= 10
     * 
     * given n is the number of b1 base, convert the number n to the b2 base.
     */

     public static long anyBaseToDecimal(int n, int b1) {
        int power = 0;
        long decimal = 0;
        while(n != 0) {
            int rem = n%10;
            n/=10;
            decimal += rem * (int)Math.pow(b1, power ++);
        }
        return decimal;
     }

     public static long decimalToanyBase(long decimalVal, int b2) {
        long out = 0;
        int power = 0;
        while(decimalVal != 0) {
            long rem = decimalVal % b2;
            decimalVal /= b2;
            out += rem*(int)Math.pow(10, power ++);
        }
        return out;
     }

     public static long anybasetoanybaseConversion(int n, int b1, int b2) {
        long decimalVal = anyBaseToDecimal(n, b1);
        long output = decimalToanyBase(decimalVal, b2);
        return output;
     }  

     public static void display(long value) {
        System.out.println(value);
        return ;
     }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        scan.close();

        long out = anybasetoanybaseConversion(n, b1, b2);
        display(out);
        return ;

    }
} 
