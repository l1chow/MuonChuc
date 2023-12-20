package Lesson3;

public class CuuSinhVien extends SinhVien {
    private int namTotNghiep;

    public CuuSinhVien(String ten, String ngaySinh, String que, int namTotNghiep) {
        super(ten, ngaySinh, que);
        this.namTotNghiep = namTotNghiep;
    }
    
    @Override
    public String toString() {
        return "CuuSinhVien{"  + "ten=" + super.getTen() + ", ngaySinh=" + super.getNgaySinh() + ", que=" + super.getQue() + ", namTotNghiep=" + namTotNghiep + '}';
    }
}
