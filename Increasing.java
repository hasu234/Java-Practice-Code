
package increasing;

import java.util.Scanner;


public class Increasing {

static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number of Element: ");
        int n;
        n=sc.nextInt();
        System.out.println("Enter The Elements: ");
        int ar[]=new int[n];
        int temp=0;
        for(int i=0; i<n; i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
             if(ar[i]<ar[j])
            {
              temp=ar[i];
              ar[i]=ar[j];
              ar[j]=temp;
            }
            }
            
            
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(ar[i]);
        }
    }
    
}
