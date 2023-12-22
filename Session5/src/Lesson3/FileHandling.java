package Lesson3;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class FileHandling {
    ArrayList<SinhVien> sv = new ArrayList<>();
    ArrayList<SinhVien> svReadFile = new ArrayList();

    public FileHandling() {
    }
    
    public void add(SinhVien x){
        x.inputInfo();
        sv.add(x);
    }
    
    public void display(ArrayList<SinhVien> list){
        for (SinhVien x : list) {
            System.out.println(x.showInfo());
        }
    }
    
    public void writeToFile(String path) throws IOException{
        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (SinhVien x : sv) {
            bw.write(x.showInfo());
            bw.newLine();
        }
        
        bw.close();
        fw.close();
    }
    
    public void readFromFile(String path) throws FileNotFoundException, IOException, ParseException{
        File f = new File(path);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        String str;
        while((str = br.readLine()) != null){
            String strSv[] = str.split(", ");
            String ten = strSv[0];
            Date ngaySinh = Main3.formatter.parse(strSv[1]);
            String que = strSv[2];
            String nganh = strSv[3];
            String temp = strSv[4];
            if(temp.equals("true") || temp.equals("false")){
                boolean daTotNghiep = Boolean.parseBoolean(temp);
                SinhVien s = new CuuSinhVien(ten, ngaySinh, que, nganh, daTotNghiep);
                svReadFile.add(s);
            } else {
                double diemTb = Double.parseDouble(temp);
                SinhVien s = new SinhVienCo(ten, ngaySinh, que, nganh, diemTb);
                svReadFile.add(s);
            }
        }
        
        br.close();
        fr.close();
    }
}
