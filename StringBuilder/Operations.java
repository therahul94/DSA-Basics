import java.lang.StringBuilder;
public class Operations{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        //get
        char ch = sb.charAt(1);
        System.out.println(ch);

        // set character or modify character
        sb.setCharAt(0, 'g');
        System.out.println(sb);

        // insert new character at any position
        sb.insert(3, 'm');
        System.out.println(sb);

        // insert the character at the last or append at last
        sb.append('u');
        System.out.println(sb);

        // delete the character from any position
        sb.deleteCharAt(5);
        System.out.println(sb);

        // length of the current string
        System.out.println(sb.length());
    }
}