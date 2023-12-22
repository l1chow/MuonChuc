package Lesson3;

import static Lesson3.Main3.formatter;
import java.util.Date;

public class CuuSinhVien extends SinhVien {
    
    private boolean daTotNghiep;

    public CuuSinhVien(String ten, Date ngaySinh, String que, String nganh, boolean daTotNghiep) {
        super(ten, ngaySinh, que, nganh);
        this.daTotNghiep = daTotNghiep;
    }

    public boolean isDaTotNghiep() {
        return daTotNghiep;
    }

    public void setDaTotNghiep(boolean daTotNghiep) {
        this.daTotNghiep = daTotNghiep;
    }
    
    @Override
    public void showInfo() {
        System.out.println(super.getTen() + ", " + formatter.format(super.getNgaySinh()) + ", " + super.getQue() + ", " + super.getNganh() + ", " + daTotNghiep);
    }
}
