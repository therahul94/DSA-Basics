package Pattern;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i = 1; i <= 10; i ++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
