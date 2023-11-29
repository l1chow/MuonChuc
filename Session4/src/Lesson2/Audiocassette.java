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
        System.out.print("Input a playing time: ");
        try {
            tape = new Scanner(System.in).nextDouble();
        } catch (Exception e) {
            System.out.println("Enter only numbers!");
        }
    }
            
    @Override
    public String putData(){
        return super.putData() + ", tape=" + tape + "}";
    }
}
