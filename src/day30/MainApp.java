package day30;

import day30.kutuphanepro.Kitap;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //Encapsulation: Paketleme, sarmalama
        /*
            public: Her yerden erişim sağlanır
            protected: Aynı package ve (alt sınıf başka package'ta olsa bile) atası olduğu alt sınıflardan erişim sağlanır
            <default>: Aynı package içerisinden erişim sağlanır
            private: Sadece sınıf içerisinden erişim sağlanır
         */
        Kitap kitap=new Kitap();

        System.out.println("Kitap Giriş Ekranı");
        Scanner input=new Scanner(System.in);
        System.out.print("Kitabın Adı : ");
        kitap.setAdi(input.nextLine());
        System.out.print("Yazarı : ");
        kitap.setYazari(input.nextLine());
        System.out.print("Sayfa Adedi : ");
        kitap.setSayfaAdedi(input.nextInt());

        kaydet(kitap);



    }


    public static void kaydet(Kitap kitap){
        System.out.println(kitap+" veritabanına kaydedildi.");
    }



}
