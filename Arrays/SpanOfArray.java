package Arrays;

import java.util.Scanner;

public class SpanOfArray {
    public static int spanOfAnArr(int[] arr, int n) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < n; i ++) {
            if(maxVal < arr[i]) {
                maxVal = arr[i];
            }
            if(minVal > arr[i]) {
                minVal = arr[i];
            }
        }
        
        return maxVal - minVal;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] inputArr = new int[n];
        for(int i = 0; i < n; i ++) {
            inputArr[i] = scan.nextInt();
        }
        scan.close();

        System.out.println("Output: " + spanOfAnArr(inputArr, n));
        return ;
    }
}
