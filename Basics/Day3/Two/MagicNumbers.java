/*
    Magic Numbers : Available in the geeksforgeeks website: visit https://www.geeksforgeeks.org/problems/magic-numbers3143/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

*/


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            int[] A = new int[N];
            String S[] = read.readLine().split(" ");
            
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.getVal(N,A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long getGCD(long a, long b) {
        while((a%b) != 0) {
            long rem = a%b;
            a = b;
            b = rem;
        }
        return b;
    }
    static Long getVal(int N, int[] A) {
        
        // code here
        long hx = A[0];
        long prev = A[0];
        for(int i = 1; i < A.length; i ++) {
            hx = hx * A[i];
            // given in the question: why +7 only because it is the prime number
            hx = hx % 1000000007;
            prev = getGCD(prev, A[i]);
        }
        double out = Math.pow(hx, prev);
        return (long)out;
        
    }
};
