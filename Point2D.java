package poi2d;
public class Point2D {
    private float x;
    private float y;
public Point2D() {
        this.x = 0;
        this.y = 0;
    }
public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
public String toString() {
        return "(" + this.x + "; " + this.y + ")";
    }
public void setX(float x) {
        this.x = x;
    }

public void setY(float y) {
        this.y = y;
    }
}