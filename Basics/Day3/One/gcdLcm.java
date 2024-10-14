package Day3.One;

import java.util.Scanner;

public class gcdLcm {

    {/*
        BRUTE-FORCE APPROACH: 

        public static int getGCD(int a, int b) {
            int minVal = Math.min(a, b);
            while(minVal > 1) {
                if( ((a % minVal) == 0) && ((b % minVal) == 0) ){
                    return minVal;
                }
                minVal --;
            }   
            return 1;
        }

        public static int getLCM(int a, int b) {
            int maxVal = Math.max(a, b);
            int minVal = Math.min(a, b);
            int i = 1;
            while(i <= minVal) {
                int lcm = i * maxVal;
                if(lcm%a == 0 && lcm%b == 0 ) {
                    return lcm;
                }
                i ++;
            }
            return a*b;
        }   
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            scan.close();

            System.out.println("GCD: "+getGCD(a, b));
            System.out.println("LCM: "+getLCM(a, b));
        }

     */}


     // Used Division method for the calculation of GCD:
     public static void getLCMAndGCD(int a, int b) {
        int oA = a;
        int oB = b;
        int gcd;
        while((a % b) != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        gcd = b;
        int lcm = Math.abs(oA * oB) / gcd;
        System.out.println("GCD: "+gcd+" LCM: "+lcm);
     }

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        getLCMAndGCD(a, b);
     }
}
