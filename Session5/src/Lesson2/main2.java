package Lesson2;

import java.io.*;
import java.util.*;

public class main2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        
        FileHandling file = new FileHandling();
        int choice = 0;
        String con;
        
        //ghi vao file
        do {
            System.out.println("Publication:\n\t1. Book\n\t2. Audiocasstte");
            do {
                 System.out.print("Input your choice (1/2): ");
                 try {
                    choice = sc.nextInt();
                } catch (Exception e) {
                     System.out.println("Enter only number!");
                }
                
            } while(choice != 1 && choice != 2);
           
            if(choice == 1) {
                Publication x = new Book();
                file.add(x);
            } else {
                Publication x2 = new Audiocassette();
                file.add(x2);
            }
            System.out.print("Continue entering ? (y/n): ");
            con = sc.nextLine();
            con = sc.nextLine();
        } while (!con.equalsIgnoreCase("n"));
        
        file.writeToFile("publication.txt");
        System.out.println("Write to file successfully!");
        
        //doc tu file
        file.readFromFile("publication.txt");
        System.out.println("Read from file:");
        file.display();
    }

}
