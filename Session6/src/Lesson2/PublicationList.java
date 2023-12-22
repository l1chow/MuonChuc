package Lesson2;

import java.io.*;
import java.util.ArrayList;

public class PublicationList {

    ArrayList<Publication> pbList = new ArrayList<>();

    public PublicationList() {
    }

    public ArrayList<Publication> getPbList() {
        return pbList;
    }

    public void add(Publication x) {
        pbList.add(x);
    }

    public void saveToFile(String path) {
        try {
            File f = new File(path);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Publication x : pbList) {
                bw.write(x.toStringFile());
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
                String obj[] = str.split("\\$");
                String name = obj[0];
                double price = Double.parseDouble(obj[1]);
                
                if (obj[2].contains("pages")) {
                    int pages = Integer.parseInt(obj[2].substring(obj[2].indexOf("=") + 1));
                    Publication book = new Book(name, price, pages);
                    pbList.add(book);
                } else if (obj[2].contains("tape")) {
                    double tape = Double.parseDouble(obj[2].substring(obj[2].indexOf("=") + 1));
                    Publication audio = new Audiocassette(name, price, tape);
                    pbList.add(audio);
                }
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("File not found!");
        }

    }
}
