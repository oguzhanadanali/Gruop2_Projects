package day34.polymorfism;

public class MainApp {
    public static void main(String[] args) {
        /*
            Polimorfizm (Çok biçimlilik):
            abstract class: Soyut sınıflar kendisinden türeyen alt sınıflara
            ne yapmaları gerektiğini söyler ama nasıl yapmaları gerektiğini söylemez.
            Kendilerine bırakır.
         */

        Kare kare=new Kare(9);

        System.out.println("Karenin Alanı   = "+kare.alanHesapla());
        System.out.println("Karenin Çevresi = "+kare.cevreHesapla());
        System.out.println();
        Sekil sekil=new Daire(7);
        double yaricap = ((Daire) sekil).getYaricap();
        System.out.println("Dairenin Yarıçapı = "+yaricap);

        Sekil[] sekiller=new Sekil[5];
        sekiller[0]=new Daire(5);
        sekiller[1]=new Kare(6);
        sekiller[2]=new Dikdortgen(8,12);
        sekiller[3]=new Daire(9);
        sekiller[4]=new Sekil() {
            @Override
            public double alanHesapla() {
                return 100;
            }

            @Override
            public double cevreHesapla() {
                return 50;
            }
        };

        for(Sekil s:sekiller){
            System.out.println("Alan  : "+s.alanHesapla());
            System.out.println("Çevre : "+s.cevreHesapla());
            System.out.println();
        }

    }




}
