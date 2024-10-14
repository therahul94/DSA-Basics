package Day2.One;

import java.util.Scanner;

public class PrintPrimeTillN {

    public static boolean isPrimeFn(int n) {
        if(n < 2) return false;
        for(int i = 2; i*i<=n; i ++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int low = scan.nextInt();
        int high = scan.nextInt();
        scan.close();
        for(int j = low; j <= high; j ++) {
            if(isPrimeFn(j)){
                System.out.println(j);
            }
        }
    }
}
