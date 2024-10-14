package Pattern;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int spaces = n - 2;
        for(int i = 0; i < n; i ++) {
            System.out.print("*\t");
            if(i < n/2) {
                for(int j = 0; j < spaces; j ++) {
                    System.out.print("\t");
                }
            }
            else {
                for(int j = 1; j < n-1; j ++) {
                    if(j+i+1 == n || j == i) { // Secondary diagonal || principle diagonal
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.print("*\t");
            System.out.println();
        }

    }
}
