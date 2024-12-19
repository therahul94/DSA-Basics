package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removePrimeNum1 {
    public static boolean checkPrime(int num) {
        for(int i = 2; i*i <= num; i ++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void removePrimeNum1Fn(List<Integer> inputList) {
        List<Integer> nonPrimeNumList = new ArrayList<>();
        for(int x : inputList){
            if(!checkPrime(x)) {
                nonPrimeNumList.add(x);
            }
        }
        inputList.clear();
        for(int m : nonPrimeNumList) {
            inputList.add(m);
        }
        System.out.println(inputList);
    }
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

        removePrimeNum1Fn(inputList);
    }
}
