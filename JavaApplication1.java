package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args)
 {
      System.out.println("ax+b=0");
      Scanner sc = new Scanner(System.in);
      System.out.println("nhap a");
      int a= sc.nextInt();
      System.out.println("nhap b");
      int b= sc.nextInt();
    if (a==0)
    {
         if(b==0){
             System.out.println("vo so nghiem");
    }
         else{
             System.out.println("vo nghiem");
         }
    }
    else
    {
      int x=-b/a;
      System.out.println("nghiem x="+x);     
    }
}
}
