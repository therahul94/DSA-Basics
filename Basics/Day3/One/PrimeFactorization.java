package Day3.One;
import java.util.Scanner;
public class PrimeFactorization {

    {/*
        Question: Print all the prime factorization of a number.
        ex: input: 24
        output: 
        2
        2
        2
        3
        explanation: 
        2*2*2*3 = 24.

        solution: 
        If you see, in the question, it is metioned clearly to print all the prime
        factorization of the given number, So in the solution, why I am not checking
        the number is prime or not? because all the factors which is either a prime
        number like 2,3... or if it is even like 4 can be factored like 2*2 and for
        odd case like 15 it is 3*5, so all the factors will be the prime only, we 
        don't have to check externally.

    */}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        int temp = num;
        for(int i = 2; i*i <= temp; i ++) {
            while(num % i == 0) {
                num = num/i;
                System.out.println(i);
            }
        }
        if(num != 1) {
            System.out.println(num);
        }
    }
}
