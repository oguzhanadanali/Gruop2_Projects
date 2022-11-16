package day29.arabalar;

public class MainApp {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        YarisArabasi yarisArabasi=new YarisArabasi();
        Araba araba2=new YarisArabasi();
        araba1.ilerle();
        yarisArabasi.ilerle();
        araba2.ilerle();
        yarisArabasi.turbo();
        //YarisArabasi ya=(YarisArabasi) araba2;

        ((YarisArabasi)araba2).turbo();
    }
}
