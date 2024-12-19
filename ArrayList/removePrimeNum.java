package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removePrimeNum {
    public static boolean checkPrime(int num) {
        for(int i = 2; i*i <= num; i ++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void removePrimeNumFn(List<Integer> inputList) {
        for(int x = inputList.size()-1; x >= 0; x --){
            if(checkPrime(inputList.get(x)) == true) {
                inputList.remove(x);
            }
        }
        System.out.println(inputList);
    }
    /*
    If you try to do this then : Exception in thread "main" java.util.ConcurrentModificationException
    public static void removePrimeNumFn(List<Integer> inputList) {
        for(int x : inputList){
            if(checkPrime(x) == true) {
                inputList.remove((Integer)x);
            }
        }
        System.out.println(inputList);
    }
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>(); 
        System.out.println("Enter number of elements for input: ");
        int n = scan.nextInt();
        System.out.println("Enter all the elements in the array");
        for(int i = 0; i < n; i ++) {
            inputList.add(scan.nextInt());
        }
        scan.close();

        removePrimeNumFn(inputList);
    }
}
