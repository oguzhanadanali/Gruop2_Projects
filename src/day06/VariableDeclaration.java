package day06;

public class VariableDeclaration {
    double PI_SAYISI=3.14;
    public static void main(String[] args) {
        //Dikdörtgenin alan ve çevre hesabını yapan bir Java programı geliştiriniz.
        //Değişken tanımlamalarında Türkçe karakterleri kullanmayınız: ığüşŞİÖöÇç
        //Notasyonlar:
        //1. Camel Notasyonu: kisaKenar
        //2. Pascal Notasyonu: VariableDeclaration
        //3. Snake Notasyonu: PI_SAYISI
        String arabaninKapisininRengi="Kırmızı";
        int kisaKenar=7;
        int uzunKenar=11;
        //Çevre hesabı: 2x (Kısa Kenar + Uzun Kenar)
        //Alan hesabı: Kısa Kenar x Uzun Kenar

        int dikdortgeninCevresi=2*(kisaKenar+uzunKenar);//statement
        int dikdortgeninAlani=kisaKenar*uzunKenar;

        //Concatenation
        System.out.println("Kısa Kenar : "+kisaKenar);
        System.out.println("Uzun Kenar : "+uzunKenar);
        System.out.println();
        System.out.println("Dikdörtgenin Çevresi = "+dikdortgeninCevresi);
        System.out.println("Dikdörtgenin Alanı   = "+dikdortgeninAlani);
    }
}
