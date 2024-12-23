import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merge {

    public static void mergeFn(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        List<Integer> tempArr = new ArrayList<>();
        while(i <= mid && j <= high) {
            if(arr[i] > arr[j]) {
                tempArr.add(arr[j]);
                j ++;
            }
            else {
                tempArr.add(arr[i]);
                i ++;
            }
        }
        while(i <= mid) {
            tempArr.add(arr[i]);
            i ++;
        }
        while(j <= high) {
            tempArr.add(arr[j]);
            j ++;
        }
        int idx = low;
        for(int val = 0; val <= tempArr.size()-1; val ++) {
            arr[idx] = tempArr.get(val);
            idx ++;
        }
    }
    public static void mergeSortFn(int[] arr, int low, int high) {
        if(low >= high) return; // base case
        int mid = (low + high) / 2;
        mergeSortFn(arr, low, mid);
        mergeSortFn(arr, mid + 1, high);
        mergeFn(arr, low, mid, high);
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

        mergeSortFn(arr, 0, arr.length-1);
        System.out.println("After Merge sort: ");
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
    }
}

/*
 i       j
14 16    3  17
 */