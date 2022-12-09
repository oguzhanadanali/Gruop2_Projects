package day45;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
        /*
            1. try-catch
            2. try-catch-catch-...
            3. try-catch-finally

            checked Exception
         */

        char[] buffer = new char[1024];
        try {
            FileReader fr = new FileReader("files/deneme.txt");
            int okunanMiktar = fr.read(buffer);
            System.out.println("Okunan karakter adedi : " + okunanMiktar);
            for (int i = 0; i <okunanMiktar; i++) {
                System.out.print(buffer[i]);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }


            /*
                catch (IOException | ArrayIndexOutOfBoundsException|NullPointerException ex ){
            System.err.println(ex.getMessage());
        }

             */


    }
}
