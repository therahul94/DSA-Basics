package Day2.Two;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int temp = n;
        int count = 0;
        while (temp != 0) {
            count += 1;
            temp /= 10;
        }
        System.out.println(count);

    }

    // It won't work for -ve numbers. and for input like 09874 it is showing output
    // 4, I dont know why?
    // public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // int n = scan.nextInt();
    // scan.close();
    // String temp = Integer.toString(n);

    // System.out.println(temp.trim().length());
    // }
}
