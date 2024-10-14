package Numbers;

import java.util.Scanner;
public class AnyBaseAdd {
    /*
         * We will take 2 numbers of same base.
         * let say n1 = 236 of base 8
         * n2 = 754 of base 8
         * b1 = 8 (base of the number).
         * 
         * answer : 1212 of base 8.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int b1 = scan.nextInt();
        scan.close();
        int data = 0;
        int index = 0, output = 0;
        while(n1 > 0 || n2 > 0 || data > 0) {
            int a = n1 % 10;
            int b = n2 % 10;
            int add = a + b + data;
            int rem = add % b1;
            data = add / b1;
            output += rem * (int)Math.pow(10, index ++);
            n1 /= 10;
            n2 /= 10;
        }
        System.out.println(output);
    }
}
