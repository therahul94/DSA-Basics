package Numbers;
import java.util.Scanner;
public class AnyBaseSubtraction {
    public static int[] input() {
        Scanner scan = new Scanner(System.in);
        int[] input = new int[3];
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        input[0] = n1;
        input[1] = n2;
        input[2] = b;
        return input;
    }
    public static void main(String[] args) {
        int[]numInput = input();
        int c = 0;
        int n1 = numInput[0];
        int n2 = numInput[1];
        int base = numInput[2];
        int power = 0;
        int res = 0;
        
        while(n2 > 0) {
            int d1 = n1 % 10;
            n1 /= 10;
            int d2 = n2 % 10;
            n2 /= 10;
            int diff = 0;
            d2 += c;
            if(d2 >= d1) {
                c = 0;
                diff = d2-d1;
            }else {
                c = -1;
                diff = d2 + base - d1;
            }
            res += diff * (int)Math.pow(10, power ++);
        }
        System.out.println(res);
        return ;
    }
}
