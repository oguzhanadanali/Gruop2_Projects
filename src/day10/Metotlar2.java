package day10;

public class Metotlar2 {
    public static void main(String[] args) {
        cevreHesapla(7);
        cevreHesapla(8);
        cevreHesapla(9);
        cevreHesapla(3);
        cevreHesapla(5);
        cevreHesapla(1);
    }

    public static void cevreHesapla(int kenar){
        int cevre=4*kenar;
        System.out.println("Çevre : "+cevre);
    }

}
