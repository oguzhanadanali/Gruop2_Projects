package day26;

import day26.mathe.DortIslem;


public class Program {
    public static void main(String[] args) {
        DortIslem islem1=new DortIslem(5,7);
        //islem1.sayi1=5;
        //islem1.sayi2=7;



        System.out.println("Toplam = "+islem1.topla());
        System.out.println("Çarpım = "+islem1.carp());


        System.out.println();
        DortIslem islem2=new DortIslem(9,11);
        //islem2.sayi1=9;
        //islem2.sayi2=11;
        System.out.println("Toplam = "+islem2.topla());
        System.out.println("Çarpım = "+islem2.carp());
    }
}
