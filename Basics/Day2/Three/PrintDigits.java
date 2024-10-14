package Day2.Three;

import java.util.Scanner;

public class PrintDigits {
    {/*
        Input: 12345
        output: 
        1
        2
        3
        4
        5
    */}
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int n = scan.nextInt();
    //     scan.close();
    //     String finalVal = "";

    //     while(n!=0) {
    //         finalVal = n%10 + "\n" + finalVal;
    //         n /= 10;
    //     }
    //     System.out.println(finalVal);
    // }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        // Count the number of digits to take out the leftmost digit from
        // the number.
        int count = 0;
        int temp = n;
        while(temp != 0) {
            temp /= 10;
            count += 1;
        }
        int div = (int)Math.pow(10, count-1);
        while(div != 0) {
            System.out.println(n/div);
            n %= div;
            div /= 10;
        }
    }
}
