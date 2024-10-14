package Pattern;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        // int spaces = 2*n-3;
        // for(int i = 1; i <= n; i ++) {
        //     int j;
        //     for(j = 0; j < i; j ++) {
        //         System.out.print(j+1 + "\t");
        //     }
        //     for(int k = 0; k < spaces; k ++) {
        //         System.out.print("\t");
        //     }
        //     int l;
        //     if(i == n){
        //         l = j - 1;
        //     }
        //     else {
        //         l = j; 
        //     }
        //     for(; l > 0; l --) {
        //         System.out.print(l + "\t");
        //     }
        //     spaces-=2;
        //     System.out.println();
        // }
        
        int spaces = 2*n-3;
        for(int i = 1; i <= n; i ++) {
            int val = 1;
            for(int j = 1; j <= i; j ++) {
                System.out.print(val + "\t");
                val ++;
            }
            for(int j = 0; j < spaces; j ++) {
                System.out.print("\t");
            }
            int st = i;
            if(i == n) {
                st = i - 1;  
                val--;
            }
            for(int j = 1; j <= st; j ++) {
                val --;
                System.out.print(val+"\t");
            }

            spaces -= 2;
            System.out.println();
        }

    }
}
