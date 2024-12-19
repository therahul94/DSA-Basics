import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class pairsNegPos {

    public static List<Integer> posNegPair(int[] arr) {
        // Code here
        Arrays.sort(arr);
        List<Integer> finalList = new ArrayList<>();
        for(int left = 0, right = arr.length-1; left < right; ) {
            int sum = arr[left] + arr[right];
            // int tempNum = (-1) * arr[right];
            if(sum == 0) {
                finalList.add(arr[left]);
                finalList.add(arr[right]);
                left ++;
                right --;
            }
            else if(sum > 0) {
                right --;
            }
            else {
                left ++;
            }
        }
        return finalList;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int len = scan.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i ++ ) {
            arr[i] = scan.nextInt();
        }

        List<Integer> finalArr = posNegPair(arr);
        System.out.println("Output");
        for(int val : finalArr) {
            System.out.print(val + " ");
        }
        return ;
    }
}
