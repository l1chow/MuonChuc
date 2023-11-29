package Lesson3;

public class SinhVienCo extends SinhVien{
    private String nganh;
    public SinhVienCo(String ten, String ngaySinh, String que, String nganh){
        super(ten, ngaySinh, que);
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "SinhVienCo{"  + "ten=" + super.getTen() + ", ngaySinh=" + super.getNgaySinh() + ", que=" + super.getQue() + ", nganh=" + nganh + '}';
    }
}
