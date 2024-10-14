package Day2.Three;

import java.util.Scanner;

public class ReverseANum {
    {
        /*
         * Reverse a number: 
         * Input: 12345
         * Output: 
         * 5
         * 4
         * 3
         * 2
         * 1
         */
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        while(n != 0) {
            int rem = n % 10;
            System.out.println(rem);
            n /= 10;
        }
    }
}
