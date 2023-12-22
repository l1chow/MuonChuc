package Lesson2;

import java.util.Scanner;

public class Book extends Publication{
    protected int pages;

    public Book() {
    }

    public Book(String name, double price, int pages) {
        super(name, price);
        this.pages = pages;
    }
    
    @Override
    public void getData() {
        super.getData();
        System.out.print("Input numbers of page: ");
        pages = new Scanner(System.in).nextInt();
    }
    
    @Override
    public String putData(){
        return super.putData() + ", pages=" + pages + "}";
    }
}
