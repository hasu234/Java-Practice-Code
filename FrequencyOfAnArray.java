
package frequency.of.an.array;

import java.util.Scanner;


public class FrequencyOfAnArray {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Length Of An Array: ");
        int len=sc.nextInt();
        int ar[]=new int[len];
        System.out.println("Enter The Elements Of Array: ");
        for (int i = 0; i < len; i++) {
            ar[i]=sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            ar[(ar[i]%len)] +=len;
        }
        int greatest= ar[0];
        int count=0, result=0;
        for (int i = 0; i < len; i++) {
            if (ar[i]>greatest) {
                greatest=ar[i];
                result=i;
            }
        }
        System.out.println("Highest Frequency Number Is: "+result);
        for (int i = 0;i < len; i++) {
            if (ar[i]==result) {
                count++;
            }
        }
        System.out.println("Number Of Frequency Of "+result+" is : "+count);
        
    }
    
}
