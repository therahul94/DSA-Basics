package Pattern;

import java.util.Scanner;

public class Pattern6 {
    // public static void main(String[] args) {
        
    //     Scanner scan = new Scanner(System.in);
    //     int n = scan.nextInt();
    //     scan.close();

    //     for(int i = 0; i < n; i ++ ) {
    //         int spaces;
    //         int stars;
    //         if(i <= n/2) {
    //             spaces = 2*i+1;
    //             stars = n-i-2;
    //         }
    //         else {
    //             spaces = 2*(n-i)-1;
    //             stars = i-1;
    //         }

    //         // System.out.println(stars + " " + spaces + " " + stars);
    //         for(int j = 0; j < stars; j ++) {
    //             System.out.print("*\t");
    //         }
    //         for(int k = 0; k < spaces; k ++ ){
    //             System.out.print("\t");
    //         }
    //         for(int l = 0; l < stars; l ++) {
    //             System.out.print("*\t");
    //         }
    //         System.out.println();
    //     }
    // }

     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int spaces = 1;
        int stars = n-2;
        for(int i = 0; i < n;  ) {
            
            // System.out.println(stars + " " + spaces + " " + stars);
            for(int j = 0; j < stars; j ++) {
                System.out.print("*\t");
            }
            for(int k = 0; k < spaces; k ++ ){
                System.out.print("\t");
            }
            for(int l = 0; l < stars; l ++) {
                System.out.print("*\t");
            }
            System.out.println();
            i ++;
            if(i <= n/2) {
                spaces += 2;
                stars -= 1;
            }
            else {
                spaces -= 2;
                stars += 1;
            }
            
        }
    }
}
