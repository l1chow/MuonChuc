package Lesson1;

public class Triangle extends Shape{
    protected double a, b, c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p-b) * (p-c));
    }

    @Override
    public String show() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + ", color=" + color + ", area=" + getArea() +'}';
    }

}
