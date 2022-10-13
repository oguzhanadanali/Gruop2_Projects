package day07;

public class Tasks {
    public static void main(String[] args) {
        //Benim adım Gürhan ve 49 yaşındayım.
        //Önce bu şekliyle ekrana yazdırılacak. Daha sonra isim ve yaş değiştirilip tekrar yazdırılacak.
        String isim = "Gürhan";
        int yas = 49;

        System.out.println("Benim adım " + isim + " ve " + yas + " yaşındayım.");


        isim="Osman";
        yas=58;
        System.out.println("Benim adım " + isim + " ve " + yas + " yaşındayım.");


        double agirlik=3.4;
        float agirlik2=1.3f;


        boolean buyukMu=5>3;

        System.out.println(buyukMu);

        buyukMu=2>8;
        System.out.println(buyukMu);


        String mesaj="Bu bir "+"deneme mesajıdır.";
        System.out.println(mesaj);


        char ch=0x41;
        int x=0x41;

        System.out.println(x);
        System.out.println(ch);

        double kare=Math.pow(2,3);
        System.out.println(kare);

    }
}
