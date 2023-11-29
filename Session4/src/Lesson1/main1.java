package Lesson1;

public class main1 {
    public static void main(String[] args) {
        Circle c1 = new Circle("GREEN", 5.2);
        Rectangle r1 = new Rectangle("PINK", 9, 2.3);
        Triangle t1 = new Triangle("BLUE", 20, 30, 40);
        
        System.out.println(c1.show());
        System.out.println(r1.show());
        System.out.println( t1.show());
        
    }
}
