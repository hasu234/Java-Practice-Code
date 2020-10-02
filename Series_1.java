
package series_1;

import java.util.Scanner;

public class Series_1 {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter The Value: ");
        int n=sc.nextInt();
        int ev=0;
        for (int i = 1; i <= n; i++) {
            ev=(ev+(2*i-1)*(2*i-1)); 
        }
            System.out.println("The Sum is: "+ev);
        }
    
    }
