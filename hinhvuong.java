package bt1;
import java.util.Scanner;
public class hinhvuong 
{
    private int canh;
     public hinhvuong()
{
       this.canh = 0;
}
   public hinhvuong(int c)
{
       this.canh = c;
}

  
  public String toString() 
  {
       return "("+this.canh+")";
  }
 void setY(int c) {
        this.canh = c;
   }
}