package Test;

import java.util.HashSet;
import java.util.Set;

public class test1 {
    public static int someFn(int n, int[] projectCosts, int target) {
        int count = 0;
        Set<Integer> availableInts = new HashSet<Integer>();
        for(int i = 0; i < n; i ++) {
            int firstPossibleNum;
            if(target > projectCosts[i]) {
                firstPossibleNum = target - projectCosts[i];
            }else {
                firstPossibleNum = projectCosts[i] - target;
            }
            int secondPossibleNum = projectCosts[i] + target;
            if(availableInts.contains(firstPossibleNum)) {
                count ++;
            }
            if(availableInts.contains(secondPossibleNum)) {
                count ++;
            }
            availableInts.add(projectCosts[i]);
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] projectCosts = new int[]{1, 5, 3, 4, 2};
        int target = 2;

        System.out.println(someFn(n, projectCosts, target));
    }
}
