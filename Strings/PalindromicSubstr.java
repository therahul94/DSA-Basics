import java.util.Scanner;

public class PalindromicSubstr {

    public static boolean isPalidromic(String str) {
        int left = 0, right = str.length()-1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static void printPalindromicSubStr(String s) {
        for(int i = 0; i < s.length(); i ++) {
            for(int j = i+1; j <= s.length(); j ++) {
                String subS = s.substring(i, j);
                if(isPalidromic(subS)) {
                    System.out.println(subS);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        //to print all the palindromic substrings
        printPalindromicSubStr(str);
    }
}
