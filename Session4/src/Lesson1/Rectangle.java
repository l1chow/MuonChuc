package Lesson1;

public class Rectangle extends Shape{
    protected double a, b;

    public Rectangle( String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String show() {
        return "Rectangle{" + "a=" + a + ", b=" + b + ", color=" + color + ", area=" + getArea() +'}';
    }

}
