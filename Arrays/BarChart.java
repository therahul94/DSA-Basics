package Arrays;

import java.util.Scanner;

public class BarChart {
    /*
     * arr = [3, 1, 2, 7, 5]
     * 
     *                 *
     *                 *
     *                 *  *
     *                 *  *
     *        *        *  *
     *        *     *  *  *
     *        *  *  *  *  *
              3  1  2  7  5
     */
    public static int findMax(int[] arr, int n) {
        int maxElem = arr[0];
        for(int i = 0; i < n; i ++) {
            if(maxElem < arr[i]) {
                maxElem = arr[i];
            }
        }
        return maxElem;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] inputArr = new int[n];
        for(int i = 0; i < n; i ++) {
            inputArr[i] = scan.nextInt();
        }
        scan.close();
        int maxElem = findMax(inputArr, n);

        // Approach 1 : 

        // for(int i = 0; i < maxElem; i ++) {
        //     for(int j = 0; j < n; j ++) {
        //         if(maxElem - i <= inputArr[j] ) { 
        //             System.out.print("*\t");
        //         }
        //         else {
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // Approach 2 : 
        for(int floor = maxElem; floor >= 1; floor --) {
            for(int i = 0; i < inputArr.length; i ++) {
                if(inputArr[i] >= floor) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
