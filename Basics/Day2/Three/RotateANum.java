package Day2.Three;

import java.util.Scanner;

public class RotateANum {
    {
        /*
         * You have to rotate a number: n,
         * you have two inputs
         * 1. n = 27391
         * 2. rotations = 1
         * 
         * if you rotate the number +ve 1 times, the final answer would be 12739
         * if you rotate the number +ve 2 times, the final answer would be 91273
         * 
         * what if
         * 1. n = 27391
         * 2. rotations = -1
         * 
         * if you rotate the number -ve 1 times, the final answer would be 73912
         * if you rotate the number -ve 2 times, the final answer would be 39127
         */}

    {
        /*
         * 
         * 
         * public static void main(String[] args) {
         * Scanner scan = new Scanner(System.in);
         * int n = scan.nextInt();
         * int rotations = scan.nextInt();
         * scan.close();
         * 
         * // count the digits in the input number
         * int temp = n;
         * int count = 0;
         * while (temp != 0) {
         * count += 1;
         * temp /= 10;
         * }
         * 
         * rotations = rotations % count;
         * if(rotations < 0) {
         * rotations = count + rotations;
         * }
         * 
         * 
         * while(rotations > 0) {
         * int rem = n % 10;
         * n /= 10;
         * n += (int)Math.pow(10, count-1)*rem;
         * rotations --;
         * }
         * System.out.println(n);
         * 
         * }
         * 
         */}

         public static int getPow(int num, int powerVal) {
            return (int)Math.pow(num, powerVal);
         }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rotations = scan.nextInt();
        scan.close();

        // count the digits in the input number
         int temp = n;
         int count = 0;
         while (temp != 0) {
         count += 1;
         temp /= 10;
         }
         
         rotations = rotations % count;
         // if condition is for the conversion of -ve rotations into +ve.
         if(rotations < 0) {
            rotations = count + rotations;
         }
        
         int rem = n % getPow(10, rotations);
         int quo = n / getPow(10, rotations);
         int rotatedNum = rem * getPow(10, count-rotations) + quo;
         System.out.println(rotatedNum);
    }
}
