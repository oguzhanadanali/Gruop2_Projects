package day12.logicalops;

public class Ornekler {
    public static void main(String[] args) {
        //Mantıksal operatörler için örnekler

        boolean b=!(4>3);
        //System.out.println(b);
        /*
            Klavyeden girilen üç sayının bir birlerine göre
            büyüklüklerini test ediniz.
            ortaya çıkan sonuçları &, |, ^ ve ! ile işleme
            sokup ekranda gösteriniz.
         */


        int n1,n2,n3;
        n1=105;
        n2=75;
        n3=35;
        boolean b1=n1>n2;
        boolean b2=n1>n3;
        boolean b3=n2>n3;

        System.out.println("Durum 1 ve Durum 2 : "+(b1&b2));



    }
}
