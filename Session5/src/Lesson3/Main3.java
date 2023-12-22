package Lesson3;

import java.io.IOException;
import java.text.*;
import java.util.Scanner;

public class Main3 {
    public static Scanner sc = new Scanner(System.in);
    public static DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
    public static void main(String[] args) throws ParseException, IOException{
        FileHandling file = new FileHandling();
        int choice = 0;
        String nhapTiep;
        String pathFile = "sinhvien.txt";
        
        //ghi vao file
        do {
            System.out.println("Sinh Vien:\n\t1. Sinh vien Co\n\t2. Sinh vien Dien\n\t3. Cuu sinh vien");
            do {
                 System.out.print("Nhap lua chon (1/2/3): ");
                 try {
                    choice = Integer.parseInt(sc.nextLine());
                } catch (Exception e) {
                     System.out.println("Chi nhap so!");
                }
                
            } while(choice != 1 && choice != 2 && choice != 3);
           
            if(choice == 1) {
                SinhVien x = new SinhVienCo();
                file.add(x);
            } else if(choice == 2) {
                SinhVien x2 = new SinhVienDien();
                file.add(x2);
            } else {
                SinhVien x3 = new CuuSinhVien();
                file.add(x3);
            }
            System.out.print("Nhap tiep ? (y/n): ");
            nhapTiep = sc.nextLine();
        } while (!nhapTiep.equalsIgnoreCase("n"));
        
        file.writeToFile(pathFile);
        System.out.println("Ghi vao file thanh cong!");
        
        System.out.println("\tDOC TU FILE:");
        file.readFromFile(pathFile);
        file.display(file.svReadFile);
    }
        
}
