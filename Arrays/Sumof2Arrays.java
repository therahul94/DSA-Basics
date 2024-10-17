package Arrays;

import java.util.Scanner;

public class Sumof2Arrays {
    /*
     * Constraints: 
     * 1 <= n1, n2 <= 100 
     * 0 <= input1[i], input2[i] < 10
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] input1 = new int[n1];
        for(int i = 0; i < n1; i ++) {
            input1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] input2 = new int[n2];
        for(int i = 0; i < n2; i ++) {
            input2[i] = scan.nextInt();
        }
        scan.close();

        int maxLen = input1.length > input2.length ? input1.length : input2.length;
        int i = 1, carry = 0;
        int[] finalArr = new int[maxLen];
        // int finalRes = 0, power = 0;
        // int finalArrLen = 0;
        while( i <= maxLen) {
            int index1 = input1.length - i;
            int index2 = input2.length - i;
            int num1, num2;
            if(index1 < 0) {
                num1 = 0;
            }
            else {
                num1 = input1[index1];
            }
            if(index2 < 0) {
                num2 = 0;
            }
            else {
                num2 = input2[index2];
            }
            int add = num1 + num2 + carry;
            carry = add / 10;
            add %= 10;
            finalArr[maxLen - i] = add;
            i ++;

            // as we know the array size can be of 100(according to the constraints),
            // so we cannot store the final result in the int type variable.
            // finalRes += add*(int)Math.pow(10, power ++);
            // finalArrLen += 1;
        }
        // int[] finalArr = new int[finalArrLen];
        // for(int j = finalArrLen - 1; j >= 0; j --) {
        //     finalArr[j] = finalRes % 10;
        //     finalRes /= 10;
        // }
        // for(int val : finalArr) {
        //     System.out.println(val);
        // }


        /* This below if condition is for the carry, if some carry is remaining
         * like if we add the 99 + 1 = 100, we have final array of size 2 because 
         * it is the maximum size between | 9 | 9 | and | 1 |, so the final result
         * need one more extra space to store, but our final array is of size 2, so 
         * we will show the carry first, and then rest of the elements in the final
         * array.
         * carry = 1
         * finalArr = | 0 | 0 |
         * 
         * so final answer is : 1 0 0 
         */
        if(carry != 0) {
            System.out.println(carry);
        }
        for(int val : finalArr) {
            System.out.println(val);
        }
        return ;
    }
}
