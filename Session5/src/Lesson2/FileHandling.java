package Lesson2;

import java.io.*;
import java.util.ArrayList;

public class FileHandling {
    ArrayList<Publication> pl = new ArrayList();
    ArrayList<Publication> plReadFile = new ArrayList();

    public FileHandling() {
    }
    
    public void display() {
        for (Publication x : plReadFile) {
            System.out.println(x.putData());
        }
    }
    
    public void add(Publication x) {
        x.getData();
        pl.add(x);
    }
    
    public void writeToFile(String path) throws IOException {
        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (Publication x : pl) {
            bw.write(x.putData());
            bw.newLine();
        }
        
        bw.close();
        fw.close();          
    }
    
    public void readFromFile(String path) throws FileNotFoundException, IOException {
        File f = new File(path);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        String str;
        while ((str = br.readLine()) != null) {
            String strPub[] = str.split(", ");
            
            String name = strPub[0];
            double price = Double.parseDouble(strPub[1]);
                
            if(strPub[2].contains("pages")) {
                int pages = Integer.parseInt(strPub[2].substring(strPub[2].indexOf("=") + 1));
                Publication book = new Book(name, price, pages);
                plReadFile.add(book);
            } else if (strPub[2].contains("tape")) {
                double tape = Double.parseDouble(strPub[2].substring(strPub[2].indexOf("=") + 1));
                Publication audio = new Audiocassette(name, price, tape);
                plReadFile.add(audio);
            }
        }
        
        br.close();
        fr.close();
        
    }
}
