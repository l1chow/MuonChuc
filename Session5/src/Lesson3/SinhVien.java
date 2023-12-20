package Lesson3;

public class SinhVien {
    private String ten;
    private String ngaySinh;
    private String que;

    public SinhVien() {
    }
    
    public SinhVien(String ten, String ngaySinh, String que){
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.que = que;
    }
    
    public String getTen(){
        return ten;
    }
    
    public void setTen(String ten){
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ten=" + ten + ", ngaySinh=" + ngaySinh + ", que=" + que + '}';
    }
    
}
