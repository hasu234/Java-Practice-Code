
package seasonfrommonth;

import java.util.Scanner;


public class SeasonFromMonth {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("1. For Boishakh\n2. For Jyaistha\n3. For Asadh\n4. For Shraban\n5. For  Bhadra\n6. For Ashvin\n7. For Kartik\n8. For Agrahayan\n9. For Paus\n10. For Magh\n11. For Phalgun\n12. For Chaitra\nEnter Your Choice:");
        int month=sc.nextInt();
        switch(month)
        {
            case 1:
            case 2:
                System.out.println("GRISMA!");
                break;
            case 3:
            case 4:
                System.out.println("BARSA!");
                break;
            case 5:
            case 6:
                System.out.println("SHARAT!");
                break;
            case 7:
            case 8:
                System.out.println("HEMANTA!");
                break;
            case 9:
            case 10:
                System.out.println("SHIT!");
                break;
            case 11:
            case 12:
                System.out.println("BASANTA!");
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
    
}
