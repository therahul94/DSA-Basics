package Day3.Two;
import java.util.Scanner;
public class AllPrimeFactors {
    {/*
    
        Example1: 

        Input: N=60
        Output: 2, 3, 5
        Explanation: All factors/divisors of 60 
                    include: 1, 2, 3, 4, 5, 6, 10, 12, 18, 20, 30, 60.
                    Out of these only 2, 3 and 5 are prime.

        Example 2:
        
        Input: N=35
        Output: 5, 7
        Explanation: 
        All factors/divisors of 35 include: 1, 5, 7, 35.
        Out of these, only 5 and 7 are prime.

    */}


    // BRUTE-FORCE METHOD: 
    /*
    
        static boolean isPrimeFn(int n) {
            for(int i = 2; i*i <= n; i ++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            scan.close();

            for(int i = 2; i*i <= num; i ++) {   // O(n^1/2)
                if(num % i == 0 && isPrimeFn(i)) {
                    System.out.println(i);
                    if(isPrimeFn(num/i)) {
                        System.out.println(num/i);
                    }
                }
            }
        }


        T(n) = Time Complexity

        n^1/2 = Outer loop max
        n^1/2 = Inner loop max

        T(n) = n^1/2 * n^1/2
        T(n) = O(n)

    */


    {/*

        OPTIMAL-APPROACH: 

        In day3->One folder, we have done one question primeFactorization.java
        In that question we were calculating all the prime factors of the given
        number. approach : we are reducing by dividing it to the smallest divisor
        like 2,3... until it reaches not cannot be divided by 2 then we will try with
        3 and so on...

        same approach to finding prime factors of a number would be
        to continuously divide the number by its smallest prime factor until it 
        becomes a prime number itself.
    
        T(n) = Time complexity
        T(n) = O(n^1/2)
    */}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close(); 

        int temp = num;
        for(int i = 2; i*i <= temp; i ++) {
            if(num % i == 0) {
                System.out.println(i);
            }
            while(num%i == 0) {
                num = num / i;
            }
        }
        if(num != 1) {
            System.out.println(num);
        }
    }
}
