package Lesson2;

import java.io.IOException;

public class Main2 {
    
    public static PublicationList pub = new PublicationList();
    public static String path = "publication.txt";
    
    public static void main(String[] args) throws IOException{
        Gui g = new Gui();
        g.setVisible(true);
    }

}
