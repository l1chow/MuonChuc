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
        System.out.print("\tInput page number of the book: ");
        try {
            pages = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("Enter only numbers!");
        }
    }
    
    @Override
    public String putData(){
        return super.putData() + ", pages=" + pages;
    }
}
