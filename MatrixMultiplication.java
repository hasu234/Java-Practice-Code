
package matrix.multiplication;

import java.util.Scanner;

public class MatrixMultiplication {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter The Dimention Of Matrix: ");
        int d=sc.nextInt();
        int a[][]=new int[d][d];
        int b[][]=new int[d][d];
        int c[][]=new int[d][d];
        System.out.println("Enter The Element Of First Matrix: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter The ELement Of Second Matrix: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                for (int k = 0; k < d; k++) {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("The Result Is: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
    
}
     