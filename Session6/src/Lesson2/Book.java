package Lesson2;

public class Book extends Publication{
    protected int pages;

    public Book() {
    }

    public Book(String name, double price, int pages) {
        super(name, price);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toStringFile() {
        return super.getName() + "$" + super.getPrice() + "$pages=" + pages;
    }
    
    
}
