package Lesson2;

public class main2 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Audiocassette a1 = new Audiocassette();
        
        b1.getData();
        a1.getData();
        System.out.println(a1.putData());
        System.out.println(b1.putData());
    }
}
