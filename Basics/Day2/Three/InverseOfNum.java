package Day2.Three;

import java.util.Scanner;

public class InverseOfNum {
    {/*



        Find the inverse of a number.
        Input: 68132745
        Output:73812546

        Explanation:
        positions: 8 7 6 5 4 3 2 1  (Position of each digit.)
        Input:     6 8 1 3 2 7 4 5  (This is the actual number, got from input.)

        Output:    7 3 8 1 2 5 4 6
        How we got this output? Ans is to make inverse we will see the input digit
        as a position and its position as a value.
        so Now 5(digit) is avaiable at 1st position, but in inverse 1 will be avail
        at 5th position. ans this is how we will generate the inverse of any number.

        *Invalid inputs* 
        674942 : because it have 9 as a digit and total number of digits are 6, so 
        no positions for 9.

        so only those number will be there where all the numbers are availble as the
        length.
        like valid:  4213, 634215 
    */}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int sum = 0;
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            count += 1;
            sum += count * (int)Math.pow(10, rem-1);
            n /= 10;
        }
        System.out.println(sum);
    }
}
