package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i=0; i<n; i ++) {
            for(int j=0; j<n-i; j ++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
