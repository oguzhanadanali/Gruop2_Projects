package day16;

public class Loops7 {
    public static void main(String[] args) {
        int toplam=0;
        double ort=0.0;
        for (int i = 0; i <=10 ;i++) {
            toplam=toplam+i;
        }
        ort= toplam/10.0;
        System.out.println("Ortalama = "+ort);
    }
}
