import java.util.Scanner;

public class AsciiDiffInChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i = 0, j = 1; j < str.length(); i ++, j ++) {
            int value = str.charAt(j) - str.charAt(i);
            sb.append(value);
            sb.append(str.charAt(j));
        }
        System.out.println(sb.toString());
    }
}
