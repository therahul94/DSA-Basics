package Pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int stars = 0;

        for(int i = 0; i < n; i ++) {
            int spaces = n/2;
            for(int j = 0; j < spaces; j ++) {
                if(i == n/2) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            if(i > n/2) {
                stars--;
            }else {
                stars ++;
            }
            for(int j = 1; j <= stars; j ++) {
                System.out.print("*\t");
            }
System.out.println();
        }
    }
}
