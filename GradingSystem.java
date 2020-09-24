package grading.system;

import java.util.Scanner;


public class GradingSystem {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your Marks: " );
        int a;
        a = s.nextInt();
        if(a>=80){
            System.out.println("Your Grade Is A+!");
        }
        else if(a>=75&&a<=79){
            System.out.println("Your Grade Is A!");
        }
        else if(a>=70&&a<=74){
            System.out.println("Your Grade Is A-");
        }
        else if(a>=65&&a<=69){
            System.out.println("Your Grade Is B+!");
        }
        else if(a>=60&&a<=64){
            System.out.println("Your Grade Is B!");
        }
        else if(a>=55&&a<=59){
            System.out.println("Your Grade Is B-!");
        }
        else if(a>=50&&a<=54){
            System.out.println("Your Grade Is C+!");
        }
        else if(a>=45&&a<=49){
            System.out.println("Your Grade Is C!");
        }
        else if(a>=40&&a<=44){
            System.out.println("Your Grade Is D!");
        }
        else 
            System.out.println("You Grade if F!");
    }
    
}
