package day46;

public class MainApp4 {
    public static void main(String[] args) {
        /*
            try-catch-finally
         */

        try {
            System.out.println("Try başladı.");
            System.out.println("Sonuç = "+67/0);
            System.out.println("Hatadan sonraki kod.");
        }catch (Exception ex){
            System.out.println("Catch'e girildi.");
        }finally {
            System.out.println("Finally çalıştı.");
        }

        System.out.println("Program sonlandı.");

    }
}
