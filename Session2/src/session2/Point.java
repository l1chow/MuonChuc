package session2;

public class Point {
    private double x, y, z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public void print(){
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
    
    public void negate(){
        this.x = x * -1;
        this.y = y * -1;
        this.z = z * -1;
    }
    
    public double norm() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    
    public static void main(String[] args) {
        Point p = new Point(1, 2, 3);
        p.print();
        p.negate();
        p.print();
        System.out.println(p.norm());
    }
}
