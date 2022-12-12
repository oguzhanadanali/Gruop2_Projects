package day48;

public class MainApp {
    public static void main(String[] args) {
        /*
                1. Keywords: try-catch-finally-throw-throws
                2. Classes: Exception-NullPointerException-ArrayIndexOutofBoundsException-...
                3. Hata Durumları
                    a. Errors: Sistem hataları
                    b. Exceptions
                        1. Checked Exceptions: Compile-Design Time Exceptions
                        2. Unchecked Exceptions: Runtime Exceptions
         */


        try {
            Kare k=new Kare(-7);
        } catch (LengthException e) {
            e.printStackTrace();
        }

        /*
            1. Geometrik şekillerde uzunluk için
            2. Yetersiz bakiye
            3. Parola, Kullanıcı adı
            4. hatalı iban
            5. hatalı TCK No
            6. Aralık dışı değer girilmesi
            7. Stokta ürün bulunmama hatası
            8.

         */

    }
}
