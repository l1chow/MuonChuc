package Lesson3;

public class main3 {
    public static void main(String[] args){
        SinhVienDien d1 = new SinhVienDien("A", "1-2-2000", "Ha Noi", "Dien");
        System.out.println(d1.toString());
        
        SinhVienCo d2 = new SinhVienCo("B", "2-2-2000", "Hai Phong", "Co");
        System.out.println(d2.toString());
        
        CuuSinhVien d3 = new CuuSinhVien("C", "3-2-2000", "Thai Nguyen", 2023);
        System.out.println(d3.toString());
    }
}
