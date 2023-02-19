package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("nhap so dien da dung trong thang");
       int a =sc.nextInt();
       if(a<0)
        {
            do
                {
                 System.out.println("so dien phai khong am, nhap lai so dien");
                  a = sc.nextInt();  
                } while(a<0);
             if(a>50)
                {
                     int tien = 50*1000 + (a - 50)*1200;
                     System.out.println("tien dien la"+tien);
                }
             else if(a<=50&a>=0)   
            {
                int tien= a*1000;
                System.out.println("tien dien la"+tien);
            }
        }
       else if(a>50)
           {
                int tien = 50*1000 + (a - 50)*1200;
                System.out.println("tien dien la"+tien);
           }
        else    
            {
                int tien= a*1000;
                System.out.println("tien dien la"+tien);
            }
    }
}   