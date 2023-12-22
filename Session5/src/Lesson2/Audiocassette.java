package Lesson2;

import static Lesson2.Main2.sc;

public class Audiocassette extends Publication{
    protected double tape;

    public Audiocassette() {
    }

    public Audiocassette(String name, double price, double tape) {
        super(name, price);
        this.tape = tape;
    }
    
    @Override
    public void getData(){
        super.getData();
        System.out.print("\tInput playing time: ");
        tape = Double.parseDouble(sc.nextLine());
    }
            
    @Override
    public String putData(){
        return super.putData() + ", tape=" + tape;
    }
}
