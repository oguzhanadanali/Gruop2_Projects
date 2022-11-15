package day27;

import javax.swing.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*
            OOP - Nesneye Dayalı Programlama
            Amaç: Gerçek hayat nesnelerini soyutlayıp (abstraction), sınıf tasarımları yapmak.
            Yani gerçek hayat nesnelerinin özellik ve davranışlarının simüle edilmesi işlemidir.

            Nesneye Dayalı Programlamanın Prensipleri
            1. Kalıtım (inheritance)
            2. Sarmalama, paketleme (encapsulation)
            3. Çok biçimlilik (polymorphism)


         */
        Object obj=new Object();

        Hayvan hy1=new Hayvan();
        //hy1.isim="Hayvan 1";
        hy1.ismiKaydet("Hayvan 1");
        //hy1.yas=-3;
        hy1.yasiKaydet(3);
        //hy1.agirlik=-12;
        hy1.agirligiKaydet(12);

        System.out.printf("%s %d - %5.2f\n",hy1.ismiGetir(),hy1.yasiGetir(),hy1.agirligiGetir());



        hy1.beslen();
        hy1.uyu();


        Aslan a1=new Aslan();




    }
}
