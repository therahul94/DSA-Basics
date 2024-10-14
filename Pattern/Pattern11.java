package Pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int count = 1;
        for(int i = 0; i < n-1; i ++) {
            for(int j=0; j<=i; j ++) {
                System.out.print(count ++ + "\t");
            }
            System.out.println();
        }
    } 
}
