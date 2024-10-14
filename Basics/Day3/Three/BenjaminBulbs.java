package Day3.Three;

import java.util.Scanner;

public class BenjaminBulbs {
    /*
        Question Statement: 
        1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
        2. Take as input a number n, representing the number of bulbs.
        3. Print all the bulbs that will be on after the nth fluctuation in voltage.

        so in first fluctuation multiple of 1 bulbs will toggle like : 1,2,3,4 ...
        so in second fluctuation multiple of 2 bulbs will toggle like : 2,4,6...
        so in third fluctuation multiple of 3 bulbs will toggle like : 3,6,9...

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i = 1; i*i <= n; i ++) {
            System.out.println(i*i);
        }
    }
}
