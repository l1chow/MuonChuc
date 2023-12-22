package Lesson3;

import static Lesson3.Main3.*;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SinhVienCo extends SinhVien{
    
    private double diemTb;

    public SinhVienCo() {
    }

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
        System.out.print("Nhap diem trung binh: ");
        diemTb = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String showInfo() {
        return ten + ", " + formatter.format(ngaySinh) + ", " + que + ", " + nganh + ", " + diemTb;
    }
    
}
