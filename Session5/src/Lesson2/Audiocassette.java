package Lesson2;

import java.util.Scanner;

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
        tape = new Scanner(System.in).nextDouble();
    }
            
    @Override
    public String putData(){
        return super.putData() + ", tape=" + tape;
    }
}
