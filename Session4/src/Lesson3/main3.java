package Lesson3;

import java.text.*;

public class Main3 {
    public static DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
    public static void main(String[] args) throws ParseException{
        SinhVien[] sv = new SinhVien[] {
            new SinhVienCo("Nguyen Van A", formatter.parse("01/01/2003"), "Ha Noi", "Sua o to", 8.8),
            new SinhVienDien("Nguyen Van B", formatter.parse("01/02/2003"), "Hai Phong", "Sua dien", 9.9),
            new CuuSinhVien("Nguyen Van C", formatter.parse("01/03/2003"), "Thai Nguyen", "Sua tau", true),
            new CuuSinhVien("Nguyen Van D", formatter.parse("01/04/2003"), "Phu Tho", "Sua tivi", false)

        };
        
        for (SinhVien x : sv) {
            x.showInfo();
        }
        
    }
        
}
