package Lesson3;

import static Lesson3.Main3.*;
import java.text.ParseException;
import java.util.Date;

public class CuuSinhVien extends SinhVien {
    
    private boolean daTotNghiep;

    public CuuSinhVien() {
    }

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
    public void inputInfo(){
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        try {
            ngaySinh = formatter.parse(sc.nextLine());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        System.out.print("Nhap que: ");
        que = sc.nextLine();
        System.out.print("Nhap nganh: ");
        nganh = sc.nextLine();
        System.out.print("Da tot nghiep (true/false): ");
        daTotNghiep = Boolean.parseBoolean(sc.nextLine());
    }
    
    @Override
    public String showInfo() {
        return ten + ", " + formatter.format(ngaySinh) + ", " + que + ", " + nganh + ", " + daTotNghiep;
    }
}
