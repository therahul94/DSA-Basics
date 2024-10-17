/* Approach 1:  */

// package Arrays;

// import java.util.Scanner;

// public class SubtractionOf2Array {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n1 = scan.nextInt();
//         int[] a1 = new int[n1];
//         for (int i = 0; i < n1; i++) {
//             a1[i] = scan.nextInt();
//         }
//         int n2 = scan.nextInt();
//         int[] a2 = new int[n2];
//         for (int i = 0; i < n2; i++) {
//             a2[i] = scan.nextInt();
//         }
//         scan.close();

//         int maxlen = a2.length;
//         int i = 1, carry = 0, diff = 0;
//         int[] finalArr = new int[maxlen];
//         while (i <= maxlen) {
//             diff = carry + a2[a2.length - i];
//             int index1 = a1.length - i;
//             int num = 0;
//             if (index1 >= 0) {
//                 if(a2[a2.length - i] < a1[index1]) {
//                     carry = -1;
//                     diff += 10;     
//                 }else {
//                     carry = 0;
//                 }
//                 num = a1[index1];
//             }
//             else {
//                 if(diff < num) {
//                     carry = -1;
//                     diff += 10;
//                 }
//                 else {
//                     carry = 0;
//                 }
//             }
//             diff -= num;

//             finalArr[maxlen - i] = diff;
//             i++;
//         }
//         int a = 0;
//         while (finalArr[a] == 0)
//             a++;
//         System.out.println("Output: ");
//         while (a < finalArr.length) {
//             System.out.println(finalArr[a ++]);
//         }
//     }

// }

/* Approach 2:  */
package Arrays;

import java.util.Scanner;

public class SubtractionOf2Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scan.nextInt();
        }
        scan.close();

        int maxlen = a2.length;
        int i = 1, carry = 0, diff = 0;
        int[] finalArr = new int[maxlen];
        while (i <= maxlen) {
            diff = carry + a2[a2.length - i];
            int index1 = a1.length - i;
            int a1val = index1 >= 0 ? a1[index1] : 0;
            if (diff >= a1val) {
                carry = 0;
                diff -= a1val;
            } else {
                carry = -1;
                diff += 10 - a1val;
            }
            finalArr[maxlen - i] = diff;
            i++;
        }
        int a = 0;
        while (finalArr[a] == 0)
            a++;
        System.out.println("Output: ");
        while (a < finalArr.length) {
            System.out.println(finalArr[a++]);
        }
    }

}
