package Triangle;

public class Triangle 
{
 private float width;
 private float height;
 public Triangle()
 {
	 
 }
 public Triangle(float width,float height)
 {
	 this.width=width;
	 this.height=height;
 }
 public String toString()
 {
	 return "("+this.width+";"+this.height+")";
 }
 public void setWIDTH(float width)
 {
	 this.width=width;
 }
 public void setHEIGHT(float HEIGHT)
 {
	 this.height=height;
 }

    void setHeight(float height ) {
this.height=height;
    }

    void setWidth(float width) {
this.width=width;
    }
}