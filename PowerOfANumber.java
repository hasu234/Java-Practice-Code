
package powerofanumber;

import java.util.Scanner;


public class PowerOfANumber {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter The Base: ");
        int base=sc.nextInt();
        System.out.print("Enter The Exponent: ");
        int expo=sc.nextInt();
        double pow=1;
        for (int i = 1; i <= expo; i++) {
            pow=pow*base;
        }
            System.out.println("Power= "+pow);
    }
    
}
