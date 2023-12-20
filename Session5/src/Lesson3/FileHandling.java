package Lesson3;

import java.io.*;
import java.util.*;

public class FileHandling {
    ArrayList<SinhVien> dsSV = new ArrayList();

    public FileHandling() {
    }
    
    public void add(SinhVien x){
        dsSV.add(x);
    }
    
    public void writeToFile(String path) throws IOException {
        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (SinhVien x : dsSV) {
            bw.write(x.toString());
            bw.newLine();
        }
        
        bw.close();
        fw.close();          
    }
    
    public void readFromFile(String path) throws FileNotFoundException, IOException {
        File f = new File(path);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        System.out.println("Read from file: ");
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        
        br.close();
        fr.close();
        
    }
}
