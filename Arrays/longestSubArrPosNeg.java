package Arrays;

import java.util.Scanner;

public class longestSubArrPosNeg {
    public static int findLongSubArrPosNegFn(int[] arr, int n, int k) {
        // There will be all positive and negative numbers.
        int len = 0;
        for(int i = 0; i < n; i ++) {
            int tempSum = 0;
            for(int j = i; j < n; j ++) {
                tempSum += arr[j];
                if(tempSum == k) {
                    int tempLen = j-i+1;
                    len = Math.max(len, tempLen);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int N = scan.nextInt();
        System.out.println("\nEnter the array elements: ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i ++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("\nEnter the value of K: ");
        int K = scan.nextInt();
        scan.close();

        System.out.println("Max subarray length: " + findLongSubArrPosNegFn(arr, N, K));
    }
}
