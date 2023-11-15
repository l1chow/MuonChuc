package session2;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getFullArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    public double getCapacity() {
        return Math.PI * radius * radius * height;
    }
    
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(9, 8);
        System.out.println("Dien tich toan phan: " + c1.getFullArea());
        System.out.println("The tich: " + c1.getCapacity());
    }
}
