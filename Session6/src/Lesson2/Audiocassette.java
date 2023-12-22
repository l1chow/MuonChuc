package Lesson2;

public class Audiocassette extends Publication{
    protected double tape;

    public Audiocassette() {
    }

    public Audiocassette(String name, double price, double tape) {
        super(name, price);
        this.tape = tape;
    }

    public double getTape() {
        return tape;
    }

    public void setTape(double tape) {
        this.tape = tape;
    }
    
    @Override
    public String toStringFile() {
        return super.getName() + "$" + super.getPrice() + "$tape=" + tape;
    }
}
