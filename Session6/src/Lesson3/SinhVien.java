package Lesson3;

import static Lesson3.Main3.formatter;
import static Lesson3.Main3.sc;
import java.text.ParseException;
import java.util.Date;

public class SinhVien {

    protected String ten;
    protected Date ngaySinh;
    protected String que;
    protected String nganh;
    protected double diemTb;

    public SinhVien() {
    }

    public SinhVien(String ten, Date ngaySinh, String que, String nganh, double diemTb) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.que = que;
        this.nganh = nganh;
        this.diemTb = diemTb;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    public void inputInfo() {
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

    public String showInfo() {
        return ten + ", " + formatter.format(ngaySinh) + ", " + que + ", " + nganh + ", " + diemTb;
    }
}
