package day46;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp5 {
    public static void main(String[] args) {

        FileReader fr=null;
        try {
            fr=new FileReader("files/meti.txt");
            System.out.println("sonraki kod");
            fr.read();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosyadan veri okunamadı.");
        }
        finally {
            try {
                fr.close();
            } catch (IOException|NullPointerException e) {
                System.out.println("Dosya kapatılamadı.");
            }
        }

    }
}
