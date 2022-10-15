package day08;

public class Summary {
    public static void main(String[] args) {
        System.out.println("Merhaba!");
        //CPU
        //      7 6 5 4 3 2 1 0
        //......0 0 0 0 0 1 0 1
        int sayi=5;

        //      7 6 5 4 3 2 1 0
        //......0 1 0 0 0 0 0 1
        char c='A';

        int doubleNumber=7;
        //Notasyonlar
        /*
            Sınıf isimleri, Pascal notasyonu ile tanımlanmalıdır. Örnek; Araba, Ogrenci, Not,
            AkademikPersonel

            Değişken ve metot isimlendirmeleri, Camel notasyonu ile yapılmalıdır. Örnek;
            kolininRengi, kutununAgirligi, alanHesapla(), cevreHesapla(), Math.pow(2,3),

            Sabit degerler (final), snake notasyonu ile yazılmalıdır. Örnek; PI_SAYISI, MEDENI_HAL
         */

        double kutununAgirligi=3.0;

        float f=3.0F;

        String adi="Ahmet";
        String soyadi="Dursun";

        String isim=adi+" "+soyadi;

        System.out.println(isim);


        boolean result1=true;
        boolean result2=false;
        boolean result3=6<3;

        String str="23"+18;

        System.out.println(str);



        String mesaj="Çocuklar,\n\t\t\\> hep bir ağızdan \"Neden biz susmak zorundayız?\" dediler\b";
        System.out.println(mesaj);

    }
}
