import java.util.Scanner;

public class Selection {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void selectionSortFn(int[] arr, int n) {
        for(int i = 0; i <= n-2; i ++) {
            int minValIdx = i;
            for(int j = i; j <= n-1; j ++) {
                if(arr[minValIdx] > arr[j]) {
                    minValIdx = j;
                }
            }
            swap(arr, i, minValIdx);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the array length: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        selectionSortFn(arr, arr.length);
        System.out.println("\nAfter sorting: ");
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        } 

        return ;
    }
}
