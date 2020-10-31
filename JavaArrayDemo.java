package LabTwo;

import java.util.Scanner;

public class JavaArrayDemo {
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      int a[]=new int[5];
      int i,j;
      System.out.println("Please enter "+a.length+" Numbers ");
      for(i=0;i<a.length;i++)  
        a[i]=scan.nextInt();
      for(i=0;i<a.length-1;i++){
          for(j=i+1;j<a.length;j++){
              if(a[i]>a[j])
              {
                  int temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          }}
      System.out.println("Sorted Array: ");
          for(i=0;i<a.length;i++)
               System.out.println(a[i]);
          }   
    }
