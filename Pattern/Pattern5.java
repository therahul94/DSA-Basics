package Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < Math.abs((n/2)-i); j ++) {
                System.out.print("\t");
            }
            if(i < n/2){
                for(int k=0 ; k<2*i+1; k ++ ){
                    System.out.print("*\t");
                }
            }
            else {
                for(int k=0 ; k<2*(n-i-1)+1; k ++ ){
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
