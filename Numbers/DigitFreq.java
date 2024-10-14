package Numbers;
import java.util.Scanner;
public class DigitFreq {

    public static int countFreq(int n, int digit) {
        int count = 0;
        while(n != 0) {
            int rem = n % 10;
            if(rem == digit) {
                count += 1;
            }
            n /= 10;
        }
        return count;
    }

    public static void display(int count) {
        System.out.println("Frequency of digit: " + count);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int digit = scan.nextInt();
        scan.close();

        int freq = countFreq(n, digit);
        display(freq);
    }
}
