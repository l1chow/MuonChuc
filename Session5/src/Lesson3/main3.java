package Lesson3;

import java.io.IOException;

public class main3 {
    public static void main(String[] args) throws IOException{
        FileHandling file = new FileHandling();
        
        SinhVienDien sv1 = new SinhVienDien("A", "1-2-2000", "Ha Noi", "Dien");
        SinhVienCo sv2 = new SinhVienCo("B", "2-2-2000", "Hai Phong", "Co");
        CuuSinhVien sv3 = new CuuSinhVien("C", "3-2-2000", "Thai Nguyen", 2023);
        
        file.add(sv1);
        file.add(sv2);
        file.add(sv3);
        file.writeToFile("sinhvien.txt");
        file.readFromFile("sinhvien.txt");
    }
}
