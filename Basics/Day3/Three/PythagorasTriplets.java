package Day3.Three;

import java.util.Scanner;

public class PythagorasTriplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int hypotaneous;
        int base;
        int perpandicular;
        if(a > b) {
            if(a > c){
                hypotaneous = a;
                base = b;
                perpandicular = c;
            }
            else {
                hypotaneous = c;
                base = b;
                perpandicular = a;
            }
        }else {
            if(b > c) { 
            hypotaneous = b;
                base = a;
                perpandicular = c;
            }else {
                hypotaneous = c;
                base = a;
                perpandicular = b; 
            }
        }

        System.out.print(perpandicular + " " + base + " " + hypotaneous);
        if(hypotaneous * hypotaneous == base*base + perpandicular*perpandicular) {
            System.out.println("TRUE");
            return;
        }

        System.out.println("FALSE");
        return;
    }
}
