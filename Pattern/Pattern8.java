package Pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++) {
                if(i+j+1 == n) {
                    System.out.println("*\t");
                    break;
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    
    }
}
