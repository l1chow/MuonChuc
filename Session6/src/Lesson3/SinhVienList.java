package Lesson3;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class SinhVienList {
    ArrayList<SinhVien> svList = new ArrayList<>();

    public SinhVienList() {
    }

    public ArrayList<SinhVien> getSvList() {
        return svList;
    }

    public void add(SinhVien x){
        svList.add(x);
    }
    
    public void saveToFile(String path) {
        try {
            File f = new File(path);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (SinhVien x : svList) {
                bw.write(x.showInfo());
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("File not found!");
        }
    }

    public void loadFromFile(String path) throws FileNotFoundException, IOException {
        try {
            File f = new File(path);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null) {
                String obj[] = str.split(", ");
                
                String ten = obj[0];
                Date ngaySinh  = Main3.formatter.parse(obj[1]);
                String que = obj[2];
                String nganh = obj[3];
                double diemTb = Double.parseDouble(obj[4]);
                boolean daTotNghiep = Boolean.parseBoolean(obj[5]);
                
                SinhVien x = new CuuSinhVien(ten, ngaySinh, que, nganh, diemTb, daTotNghiep);
                svList.add(x);
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("File not found!");
        }

    }
}
