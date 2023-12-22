package Lesson3;

import static Lesson3.Main3.*;
import java.util.Date;

public class CuuSinhVien extends SinhVien {
    
    private boolean daTotNghiep;

    public CuuSinhVien() {
    }

    public CuuSinhVien(String ten, Date ngaySinh, String que, String nganh, double diemTb, boolean daTotNghiep) {
        super(ten, ngaySinh, que, nganh, diemTb);
        this.daTotNghiep = daTotNghiep;
    }

    public boolean isDaTotNghiep() {
        return daTotNghiep;
    }

    public void setDaTotNghiep(boolean daTotNghiep) {
        this.daTotNghiep = daTotNghiep;
    }
    
    @Override
    public void inputInfo(){
        super.inputInfo();
        System.out.print("Da tot nghiep (true/false): ");
        daTotNghiep = Boolean.parseBoolean(sc.nextLine());
    }
    
    @Override
    public String showInfo() {
        return super.showInfo() + ", " + daTotNghiep;

    }
}
