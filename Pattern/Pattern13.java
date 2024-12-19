package Pattern;

import java.util.Scanner;

public class Pattern13 {

    /*
     * Permutation and combination: 
     * 
     * n         (n
     *  c     =  ( c  * (n-k)) / k + 1
     *   k+1     (  k
     * 
     * iCj+1 = iCj * (i-j) / (j+1);
     * 
     * like : 
     * 
     * 5C3 = 5C2 * (5-2) / (2 + 1);
     * 
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i = 0; i < n; i ++) {
            int icj = 1;
            for(int j = 0; j <= i; j ++) {
                System.out.print(icj+"\t");
                int icjp1 = icj * (i-j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}
