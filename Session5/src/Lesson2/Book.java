package Lesson2;

import static Lesson2.Main2.sc;

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
            pages = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Enter only numbers!");
        }
    }
    
    @Override
    public String putData(){
        return super.putData() + ", pages=" + pages;
    }
}
