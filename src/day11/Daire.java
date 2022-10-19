package day11;

public class Daire {
    public static void main(String[] args) {
        double r1=7.0;
        System.out.printf("Alan = %5.2f\n",alanHesapla(r1));
        System.out.printf("Çevre = %5.2f\n",cevreHesapla(r1));
    }

    public static double alanHesapla(double yariCap){
        return Math.PI*Math.pow(yariCap,2);
    }
    public static double cevreHesapla(double yariCap){
        return 2*Math.PI*yariCap;
    }
}
