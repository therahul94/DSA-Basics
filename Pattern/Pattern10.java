package Pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int starLeft = n/2;
        int starRight = n/2;
        for(int i = 0; i < n; ) {
            for(int j = 0; j < n; j ++) {
                 if(j == starLeft || j == starRight) {
                    System.out.print("*\t");
                 }
                 else {
                    System.out.print("\t");
                 }
            }
            System.out.println();
            i++;
            if(i <= n/2) {
                starLeft -= 1;
                starRight += 1;     
             }else {
                starRight -= 1;
                starLeft += 1;
             }
        }
    }
}
