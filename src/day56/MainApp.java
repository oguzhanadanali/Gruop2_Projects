package day56;

import java.util.Comparator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Urun> urunler = Urun.stokHazirla();
        //Kaç çeşit ürünümüz vardır?
        System.out.printf("Toplam %d çeşit ürün bulunmaktadır.\n",urunler.stream().count());


        //Fiyatı 3 ve üzerinde olan kaç çeşit ürün vardır?
        long fiyat3 = urunler.stream()
                .filter(urun -> urun.fiyat() >= 3).count();
        System.out.println("Fiyatı 3 ve üzeri olan ürünlerin adedi : "+fiyat3);

        //Toplam kaç adet ürün bulunmaktadır?
        int sum = urunler.stream()
                .mapToInt(Urun::miktar).sum();
        System.out.println("Toplam Ürün Adedi : "+sum);

        //Miktarı en az olan ürün hangisidir?
        Urun urunMiktariMin = urunler.stream().min(Comparator.comparing(Urun::miktar)).get();
        System.out.println("Miktarı en az olan ürün: "+urunMiktariMin);

        //Miktarı en fazla olan ürün hangisidir?
        Urun urunMiktariMax = urunler.stream()
                .max(Comparator.comparing(Urun::miktar)).get();
        System.out.println("Miktarı en fazla olan Ürün: "+urunMiktariMax);

        //Ortalama Ürün fiyatı nedir?
        double ortalama = urunler.stream()
                .mapToDouble(Urun::fiyat).average().getAsDouble();
        System.out.printf("Ortalama Ürün Fiyatı : %5.2f\n",ortalama);

        double toplamTutar = urunler.stream()
                .mapToDouble(Urun::tutar).sum();
        System.out.printf("Depodaki ürünlerin toplam tutarı : %5.2f",toplamTutar);

        System.out.printf("%10d\n",5);
        System.out.printf("%10d\n",55);
        System.out.printf("%10d\n",555);
        System.out.printf("%10d\n",55);
        System.out.printf("%10d\n",5555);
        System.out.printf("%10d\n",555555);
        System.out.printf("%10d\n",555);
    }
}
