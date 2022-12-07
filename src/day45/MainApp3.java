package day45;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp3 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("files/deneme.txt");
            char[] buffer = new char[1024];
            int okunanMiktar = 0;

            while ((okunanMiktar = fr.read(buffer)) != -1) {
                for (int i = 0; i < okunanMiktar; i++) {
                    if (i % 80 == 0) System.out.println();
                    System.out.print(buffer[i]);
                }
            }
        } catch (Exception ex){
            if (ex instanceof FileNotFoundException){
                System.err.println("Dosya bulunamadığı logger'a yazıldı.");
            } else if (ex instanceof IOException) {
                System.err.println("Dosyadan okuma yapılamadığı logger'a yazıldı.");
            } else if (ex instanceof ArrayIndexOutOfBoundsException) {
                System.err.println("Buffer hatası logger'a yazıldı.");
            }
        }
    }
}
