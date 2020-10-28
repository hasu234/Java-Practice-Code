
package largestnumberofanarray;

import java.util.Scanner;
public class LargestNumberOfAnArray {

static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number Of Element: ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        //int max=ar[0];
        System.out.println("Enter The Elements: ");
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (ar[0]<ar[i]) {
                ar[0]=ar[i];
            }   
        }
        System.out.println("Maximum Value Is: "+ar[0]);
    }
    
}
