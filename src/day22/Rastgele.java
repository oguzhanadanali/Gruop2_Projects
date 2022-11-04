package day22;

import java.util.Random;

public class Rastgele {

    public static void main(String[] args) {
        double sayi=Math.round(100*Math.random());
        System.out.println("Sayı : "+sayi);


        Random rnd=new Random(20000);
        int fiyat= rnd.nextInt(40000);
        System.out.println(fiyat);

    }
}
