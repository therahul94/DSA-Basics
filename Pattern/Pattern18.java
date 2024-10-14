package Pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int spaces = 0;
        int stars = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < stars; j++) {
                if (i > 0 && i < n / 2 && j > 0 && j < stars-1) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");

                }

            }
            if (i < n / 2) {
                stars -= 2;
                spaces++;
            } else {
                stars += 2;
                spaces--;
            }
            System.out.println();
        }
    }
}
