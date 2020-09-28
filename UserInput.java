package LabOne;
//import java.util.*;

import java.util.Scanner;

public class UserInput {
    public static void main(String args[])
    {
         Scanner scan=new Scanner(System.in);
         int a,b,sum;
         a=scan.nextInt();
         b=scan.nextInt();
         sum=a+b;
         System.out.println(sum);
    }
}
