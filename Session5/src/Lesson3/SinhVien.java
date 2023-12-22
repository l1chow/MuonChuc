package Lesson3;

import java.util.Date;

public abstract class SinhVien {
    protected String ten;
    protected Date ngaySinh;
    protected String que;
    protected String nganh;

    public SinhVien() {
    }

    public SinhVien(String ten, Date ngaySinh, String que, String nganh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.que = que;
        this.nganh = nganh;
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
    
    public abstract void inputInfo();

    public abstract String showInfo();
}
