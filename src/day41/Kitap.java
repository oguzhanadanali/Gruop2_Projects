package day41;

import org.jetbrains.annotations.NotNull;

public class Kitap implements Comparable<Kitap> {
    private String adi;
    private String yazari;
    private int sayfa;

    public Kitap(String adi, String yazari, int sayfa) {
        this.adi = adi;
        this.yazari = yazari;
        this.sayfa = sayfa;
    }

    public Kitap() {
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazari() {
        return yazari;
    }

    public void setYazari(String yazari) {
        this.yazari = yazari;
    }

    public int getSayfa() {
        return sayfa;
    }

    public void setSayfa(int sayfa) {
        this.sayfa = sayfa;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "adi='" + adi + '\'' +
                ", yazari='" + yazari + '\'' +
                ", sayfa=" + sayfa +
                '}';
    }

    @Override
    public int compareTo(@NotNull Kitap o) {
        return this.adi.compareTo(o.adi);
    }


/*    @Override
    public int compareTo(@NotNull Kitap o) {
        int result=0;
        if(this.sayfa>o.sayfa){
            result=1;
        } else if (this.sayfa < o.sayfa) {
            result=-1;
        }
        return result;
    }*/
}
