/*
 * 
 * raHUl
 * RAhuL
 */
import java.util.Scanner;
public class Toggle{
    public static String toggleStr(String s) {
        char[] chArr = s.toCharArray();
        for(int i = 0; i < chArr.length; i ++) {   
            if(chArr[i] >= 'a' && chArr[i] <= 'z') {
                // chArr[i] = (char)(chArr[i] & ~32);
                chArr[i] = (char)('A' + chArr[i] -'a');
            }
            else if (chArr[i] >= 'A' && chArr[i] <= 'Z') {
                // chArr[i] = (char)(chArr[i] | 32);
                chArr[i] = (char)(chArr[i]-'A' + 'a');
            }
        }
        return String.valueOf(chArr);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        System.out.println(toggleStr(str));
    }
}

/*
    P - A = p - a
    p = P-A+a
    P = p-a+A
 * 
 * 
 *    64 32 16 8 4 2 1
 *     1 0  0  0 0 0 1  = 65    (|)
 *       1  0  0 0 0 0  = 32
 * --------------------------
 *     1 1  0  0 0 0 1 = 97
 * 
 * toLowerCase() -->(char) 'T' | 32 = 't'
 * 
 * toUpperCase() --> (char) 't' & ~32 = 'T'
 * 
 * 1 1  0  0 0 0 1  = 97 -> 'a'
 * 
 * -----------------------------
 * 1 0  0  0 0 0 1 = 65
 * 
 * 
 *  
 * 32 =00000000 00000000 00000000 0 0 1 0 0 0 0 0
 * ~32=11111111 11111111 11111111 1 1 0 1 1 1 1 1  
 *
 * --------------------------------------------------------
 *      11111111 11111111 11111111 1 1 1 0 0 0 0 0  (2s)
 * 
 * 
 * 
 * 00000000 00000000 00000000 0 1 1 0 0 0 0 1 = 97
 * 11111111 11111111 11111111 1 1 0 1 1 1 1 1
 * ---------------------------------------------------
 * 00000000 00000000 00000000 0 1 0 0 0 0 0 1
 *                              64   32 16  8  4  2  1
 */
