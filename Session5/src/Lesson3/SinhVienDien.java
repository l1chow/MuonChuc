package Lesson3;

public class SinhVienDien extends SinhVien{
    private String nganh;
    public SinhVienDien(String ten, String ngaySinh, String que, String nganh){
        super(ten, ngaySinh, que);
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "SinhVienDien{"  + "ten=" + super.getTen() + ", ngaySinh=" + super.getNgaySinh() + ", que=" + super.getQue() + ", nganh=" + nganh + '}';
    }

}
