import java.util.Scanner;
public class Compression1 {
    public static void compressionFn(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < str.length(); i ++) {
            if(str.charAt(i-1) != str.charAt(i)) {
                sb.append(str.charAt(i-1));
            }
            else if (i == str.length()-1) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        compressionFn(s);
    }
}