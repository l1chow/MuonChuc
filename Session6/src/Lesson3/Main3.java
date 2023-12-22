package Lesson3;

import java.io.IOException;
import java.text.*;
import java.util.Scanner;

public class Main3 {
    public static Scanner sc = new Scanner(System.in);
    public static DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public static SinhVienList sv = new SinhVienList();
    public static String pathFile = "sinhvien.txt";
    
    public static void main(String[] args) throws IOException{
        Gui g = new Gui();
        g.setVisible(true);
    }
        
}
