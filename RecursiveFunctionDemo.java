package recursivefunctiondemo;

//import java.util.Scanner;

import javax.swing.JOptionPane;


public class RecursiveFunctionDemo {

       public static void main(String[] args) {
      //  Scanner scan=new Scanner(System.in);
        //System.out.println("Enter a number:  ");
        //JOptionPane.showMessageDialog(null,"Enter a number" );
         int x=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
   
        int result=factorial(x);
        JOptionPane.showMessageDialog(null, result);
       // System.out.println("Factorial of "+x+" is "+result);
    }
    public static int factorial(int num)
    {
         if(num==0)
             return 1;
         else
             return (num*factorial(num-1));
    }
}
