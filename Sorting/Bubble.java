import java.util.Scanner;

public class Bubble {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSortFn(int[] arr, int n) {
        for(int i = 1; i <= n-1; i ++) {
            boolean swappedFlag = false;
            for(int j = 1; j <= n-i; j ++) {
                if(arr[j-1] > arr[j]) {
                    swap(arr, j-1, j);
                    swappedFlag = true;
                }
            }
            if(!swappedFlag) {
                // if there is no swap means the array is already in the ascending order.
                break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the array length: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i ++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        bubbleSortFn(arr, arr.length);
        System.out.println("After bubble sort: ");
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
    }
}

/*
 * 
 * 54321
 * 
 * 45321
 * 43521
 * 43251
 * 43215
 * 
 * 34215
 * 32415
 * 32145
 * 
 *  N-1 TIMES loop runs
 *  times : 4 3 2 1
 * 
 * 
 */