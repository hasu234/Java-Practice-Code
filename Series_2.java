package series_2;

import java.util.Scanner;

public class Series_2 {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Your Value: ");
        int n=sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 2) == 0) {
               temp =temp - i;
               }
            else {
                temp =temp + i;
                 }
            }
        System.out.println("Result Is:"+temp);
    }
    
}
