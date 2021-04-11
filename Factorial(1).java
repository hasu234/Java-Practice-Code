package factorial;

import java.util.Scanner;


public class Factor {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter A Numbe: ");
        int n=sc.nextInt();
        double fact=1;
        if(n<0)
            System.out.println("Factorial Of A Negetive Number Doesn't Exist!");
        else
        {
            for (int i = 1; i <= n; i++) {
                fact=fact*i;
            }
            System.out.println("Factorial of "+n+" is: "+fact);
        }
    }
}
