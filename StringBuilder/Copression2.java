import java.util.Scanner;

public class Copression2 {
    public static void compressionFn2(String str) {
        int currCount = 1;
        char currChar = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < str.length(); i ++) {
            if(currChar == str.charAt(i)) {
                currCount += 1;
            }
            else if(currCount > 1) {
                sb.append(currChar).append(currCount);
                currCount = 1;
                currChar = str.charAt(i);
            } else {
                sb.append(currChar);
                currChar = str.charAt(i);
            }
        }
        if(currCount > 1) {
            sb.append(currChar).append(currCount);
        }else {
            sb.append(currChar);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        compressionFn2(s);
    }
}
