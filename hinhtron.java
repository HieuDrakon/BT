package bt1;
import java.util.Scanner;
public class hinhtron {
    private int bk;
   public hinhtron()
{
       this.bk = 0;
}
   public hinhtron(int bk)
{
       this.bk = bk;
if(bk<0){
    System.out.println("nhap sai");
}
}

  
    public String toString() {
       return this.bk+"("+")";
   }
   public void setX(int bk) {
        this.bk = bk;
   }
}