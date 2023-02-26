package poi2d;
import java.util.Scanner;
import poi2d.Point2D;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point2D A = new Point2D();
        System.out.print("Nhap vao hoanh do diem A: ");
        A.setX(sc.nextFloat());
        System.out.print("Nhap vao tung do diem A: ");
        A.setY(sc.nextFloat());
        System.out.println("Toa diem diem A la: A" + A.toString());
        sc.close();
    }
}
