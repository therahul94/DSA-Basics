package Day1;

import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
                System.out.println("\nPlease enter your age: ");
                int age = Integer.parseInt(scan.nextLine());
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();

        // close the scanner to prevent resource leaks
        scan.close();
        System.out.println("\n\n Your name is " + name + " and your age is " + age);
    }
}
