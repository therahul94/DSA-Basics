import java.util.Scanner;

public class quick {
    public static void swapElems(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int placePivotFn(int[] arr, int low, int high) {
        int pivotVal = arr[low];
        int i = low;
        int j = high;
        while(i < j) {
            while(arr[i] <= pivotVal && i <= high-1) i ++;
            while(arr[j] > pivotVal && j >= low+1) j --;
            if(i < j) {
                swapElems(arr, i, j);
            }
        }
        swapElems(arr, j, low);
        return j;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int partitionIdx = placePivotFn(arr, low, high);
            quickSort(arr, low, partitionIdx-1);
            quickSort(arr, partitionIdx+1, high); 
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the array length: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        quickSort(arr, 0, arr.length-1);
        System.out.println("After Quick sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

/*
            j   i
 * 24 18  1 14 43 40 38 54            pivot = 24
 * 
 * 
 *                              
 * 1 14  18 24 38 40 43 54          pivot = 14  pivot = 43
 * 
 *              j  i
 * 1 14  18 24 38 40 43 54          pivot = 38
 * 
 * 
 *                 j  i  
 * 1 14  18 24 38 40 43 54          pivot = 40
 * 
 *                  j  i  
 * 1 14  18 24 38 40 43 54          pivot = 40
 */