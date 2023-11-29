package Lesson1;

public class Circle extends Shape{
    protected double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String show() {
        return "Circle{" + "radius=" + radius + ", color=" + color + ", area=" + getArea() +'}';
    } 

}
