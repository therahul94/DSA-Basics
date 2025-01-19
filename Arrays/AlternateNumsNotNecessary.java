/*
 * Variety-2
Problem Statement:
There’s an array ‘A’ of size ‘N’ with positive and negative elements (not necessarily equal). 
Without altering the relative order of positive and negative elements, you must return
an array of alternately positive and negative values. 
The leftover elements should be placed at the very end in the same order as in array A.
Note: Start the array with positive elements.


Examples: 
Example 1:

Input:
arr[] = {1,2,-4,-5,3,4}, N = 6
Output:
1 -4 2 -5 3 4

Explanation: 

Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.
Leftover positive elements are 3 and 4 which are then placed at the end of the array.

Example 2:
Input:
arr[] = {1,2,-3,-1,-2,-3}, N = 6
Output:
1 -3 2 -1 3 -2
Explanation: 

Positive elements = 1,2
Negative elements = -3,-1,-2,-4
To maintain relative ordering, 1 must occur before 2.
Also, -3 should come before -1, and -1 should come before -2.
After alternate ordering, -2 and -4 are left, which would be placed at the end of the ans array.

 */

 /*
  * 
  Intuition : apply the brute force method of the question where the number of 
              positives and negatives are same.
  */

import java.util.ArrayList;
import java.util.Scanner;

public class AlternateNumsNotNecessary {
    public static int[] alternateNumbers(int []a) {
        ArrayList<Integer> posList = new ArrayList<Integer>();
        ArrayList<Integer> negList = new ArrayList<Integer>();

        for(int x : a) {
          if(x > 0) {
            posList.add(x);
          }else {
            negList.add(x);
          }
        }
        // PosList : [1,2,3,4]
        // NegList : [-4,-5]
        int posCount = posList.size();
        int negCount = negList.size();
        int idx = 0;
        while(posCount > 0 && negCount > 0) {
          a[2*idx] = posList.get(idx);
          a[2*idx + 1] = negList.get(idx);
          posCount --;
          negCount --;
          idx ++;
        }
        int finalIdx = 2*idx;
        while(posCount > 0) {
          a[finalIdx ++] = posList.get(idx++);
          posCount --;
        }
        while(negCount > 0) {
          a[finalIdx ++] = negList.get(idx++);
          negCount --;
        }
        return a;
    }
    public static void main(String[] args) {
      System.out.println("Enter the length of the input array: \n");
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();

      System.out.println("\nPlease enter the elements of the input array: \n");
      int[] nums = new int[n];
      for(int x = 0; x < n; x ++) {
        nums[x] = scan.nextInt();
      }
      scan.close();

      int[] finalArr = alternateNumbers(nums);
      System.out.println("\nOutput: ");
      for(int x : finalArr) {
        System.out.print(x+" ");
      }
    }
}
