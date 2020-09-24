
package leap.year;

import java.util.Scanner;

public class LeapYear {
    
static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter The Year: ");
        int year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if (year%400==0) 
                {
                    System.out.println(+year+" is a Leap Year!");   
                }
                else
                    System.out.println(+year+" is not a Leap Year!");
            }
            else
                    System.out.println(+year+" is a Leap Year!");
        }
        else
                    System.out.println(+year+" is not a Leap Year!");
    
    }
    
}
