package Numbers;
import java.util.Scanner;
public class AnyBaseMultiplication {
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

    public static int addition(int finaldata, int tempdata, int base) {
        int carry = 0;
        int addedVal = 0;
        int power = 0;
        while(finaldata > 0 || tempdata > 0 || carry > 0) {
            int n1 = finaldata % 10;
            int n2 = tempdata % 10;
            finaldata /= 10;
            tempdata /= 10;
            int addval = n1 + n2 + carry;
            carry = addval / base;
            addedVal += (addval % base) * (int)Math.pow(10, power ++); 
        }
        return addedVal;
    }
    public static void main(String[] args) {
        int[]numInput = input();
        int n1 = numInput[0];
        int n2 = numInput[1];
        int base = numInput[2];
        int temp2 = n2;
        int finalRes = 0;
        int powerVal = 0;
        while(temp2 > 0) {
            int multi = temp2 % 10;
            temp2 /= 10;
            int carry = 0;
            int tempRes = 0;
            int power = 0;
            int temp1 = n1;
            while(temp1 > 0 || carry > 0) {
                int data = temp1 % 10;
                temp1 /= 10;
                int multires = (multi * data) + carry;
                carry = multires / base;
                tempRes += (multires % base) * (int)Math.pow(10, power ++);
            } 
            tempRes *= (int)Math.pow(10, powerVal ++);
            finalRes = addition(finalRes, tempRes, base);
        }
        System.out.println(finalRes);
        return;
    }
}
