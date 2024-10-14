package Pattern;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int spaces = n / 2;
        int count = 1;
        int loopCount = 1;
        for(int i = 0; i < n; ) {
            for(int j = 0; j < spaces; j ++) {
                System.out.print("\t");
            }
            for(int k = 0; k < loopCount; k++) {
                System.out.print(count + "\t");
                if(k < loopCount / 2) {
                    count += 1;
                }else {
                    count -= 1;
                }
            }

            i ++;
            if(i <= n/2) {
                count = i + 1;
                spaces -- ;
                loopCount += 2; 
            }else {
                count = n - i;
                spaces ++;
                loopCount -= 2;
            }
            System.out.println();
        }
    }
}
