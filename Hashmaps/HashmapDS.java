import java.util.*;
public class HashmapDS {
    public static void main(String[] args) {
        Map<Integer, Integer> table = new HashMap<>();
        int[] arr = {2,3,4,2,3,55,3};
        for(int elements : arr) {
            if(table.containsKey(elements)) {
                table.put(elements, table.get(elements) + 1);
            }
            else {
                table.put(elements, 1);
            }
        }
        System.out.println("Hashmap: \n" + table + "\n\n");
        // iterate over the map
        Set<Map.Entry<Integer, Integer>> set = table.entrySet(); 
        for(Map.Entry<Integer, Integer> entry : set) {
            System.out.println("Keys: " + entry.getKey() + " Values: " + entry.getValue());
        }
    }
}
