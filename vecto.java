package bt2;

import java.util.Scanner;
public class vecto{

    private static void vecto() {}
     public int diemdau;
     public int diemcuoi;
    private int a;
    private int b;
   public void getVecto(int a,int b)
   {
       this.a = diemdau;
       this.b = diemcuoi;
   }
  private static void congtruvecto() {
   Scanner sc = new Scanner(System.in);
      System.out.println("nhap vecto1");
      int vecto1= sc.nextInt();
      System.out.println("nhap vectoc2");
      int vecto2= sc.nextInt();
  }
    public int vecto1;
    public int vecto2;
    private int vt1;
    private int vt2;
  public void getcongtruvecto(int vt1 ,int vt2 ){
      this.vt1=vecto1;
      this.vt2=vecto2;
      
  }
 
  
public static void main(String[] args)
{
      vecto();
      congtruvecto();
}
}