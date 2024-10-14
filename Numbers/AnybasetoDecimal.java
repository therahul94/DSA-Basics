package Numbers;

import java.util.Scanner;

public class AnybasetoDecimal {

    public static void display(long value) {
        System.out.println(value);
        return;
    }

    public static long anyBaseToDecimalConversion(int n, int base) {
        long val = 0;
        int power = 0;
        while(n != 0) {
            int rem = n % 10;
            n /= 10;
            val += rem * (int)Math.pow(base, power ++);
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int base = scan.nextInt();
        scan.close();

        long getValue = anyBaseToDecimalConversion(n, base);
        display(getValue);

    }
}
