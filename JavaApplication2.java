package javaapplication2;
import java.util.Scanner;
public class JavaApplication2 
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("nhap a");
      int a= sc.nextInt();
      System.out.println("nhap b");
      int b= sc.nextInt();
      System.out.println("nhap c");
      int c= sc.nextInt();
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
    double D= (b*b)-4*(a*c) ;
    if(D<0)
      {
            System.out.println("pt vo nghiem");
      }
    if (D==0)
      {
           double x= -c/(2*b);
            System.out.println("pt co nghiem" +x);
       
      }
    if(D>0)
      {
        double x= (float) ((-b+Math.sqrt(D))/(2*a));
        double y= (float) ((-b-Math.sqrt(D))/(2*a));
        System.out.println("pt co nghiem" +x);
        System.out.println("pt co nghiem" +y);
      }   
    }
    }
}

   

