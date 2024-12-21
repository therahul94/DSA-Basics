import java.util.Scanner;

public class insertion {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void insertionSortFn(int[] arr, int n) {
        for(int i = 1; i <= n-1; i ++) {
            for(int j = i; j >= 1; j --) {
                if(arr[j-1] > arr[j]) {
                    swap(arr, j-1, j);
                }
                else {
                    break;
                }
                System.out.println(arr[j] + " " + arr[j-1]);
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

        insertionSortFn(arr, arr.length);
        System.out.println("After Insertion sort: ");
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
    }
}

/*
 * 54321
 * 
 * 
 * 
 */
