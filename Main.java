package Triangle;
import Triangle.Triangle;
import java.util.Scanner;
public class Main 
{
public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);
	Triangle X= new Triangle();
	System.out.println("Nhap chieu rong tam giac: ");
	X.setWidth(sc.nextFloat());
	System.out.println("Nhap chieu cao tam giac: ");
	X.setHeight(sc.nextFloat());
	System.out.println("Thuoc tinh tam giac X la: X " + X.toString());
	sc.close();
 }
}

