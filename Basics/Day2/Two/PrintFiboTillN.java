package Day2.Two;

import java.util.Scanner;

public class PrintFiboTillN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i ++) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
