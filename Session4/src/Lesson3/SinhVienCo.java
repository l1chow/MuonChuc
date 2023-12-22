package Lesson3;

import static Lesson3.Main3.formatter;
import java.util.Date;

public class SinhVienCo extends SinhVien{
    
    private double diemTb;

    public SinhVienCo(String ten, Date ngaySinh, String que, String nganh, double diemTb) {
        super(ten, ngaySinh, que, nganh);
        this.diemTb = diemTb;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    @Override
    public void showInfo() {
        System.out.println(super.getTen() + ", " + formatter.format(super.getNgaySinh()) + ", " + super.getQue() + ", " + super.getNganh() + ", " + diemTb);
    }
    
}
