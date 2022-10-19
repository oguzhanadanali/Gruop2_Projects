package day10;

public class Metotlar {
    public static void main(String[] args) {

        //Verilen bir sayının karesini hesaplayan Java programını yazınız.
        int sayi=7;
        int kare=sayi*sayi;
        System.out.println("Sayının karesi = "+kare);
        System.out.println("----------------------------------");
        kareAl(9);
    }


    public static void kareAl(int sayi){
        int kare=sayi*sayi;
        System.out.println("Sayının karesi = "+kare);
    }



}
