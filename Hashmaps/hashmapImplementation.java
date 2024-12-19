
/*
 * The time complexity for searching the element in the hashmap(implemented using
 * the arraylist) 
 * T(N) = O(N^2)
 * S(N) = O(N)
 */

import java.util.*;
class Pair {
    int elem;
    int value;

    // Pair(int key, int value){
    //     this.elem = key;
    //     this.value = value;
    // }
}
public class hashmapImplementation {
    public static void main(String[] args) {
        List<Pair> hashtable = new ArrayList<>();
        int[] arr = {2,7,6,2,3,2,7,5};
        //for traversing the array.
        for(int val : arr){
            int flag = 0;

            // for checking the hashtable, if the element is available in the hashtable
            // we will increase the value by 1
            for(Pair record : hashtable) {
                if(record.elem == val) {
                    record.value += 1;
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                // Pair p = new Pair(val, 1);
                Pair p = new Pair();
                p.elem = val;
                p.value = 1;
                hashtable.add(p);
            }
        }

        // to print all the element of the hashtable
        for(Pair pair : hashtable) {
            System.out.println(pair.elem + " " + pair.value);
        }
        return;
    }
}