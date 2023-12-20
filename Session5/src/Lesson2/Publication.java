package Lesson2;

import java.util.Scanner;

public class Publication {
    private String name;
    private double price;

    public Publication() {
    }

    public Publication(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tInput name: ");
        name = sc.nextLine();
        System.out.print("\tInput price: ");
        price = sc.nextDouble();
    }
    
    public String putData() {
        return name + ", " + price;
    }
    
}
