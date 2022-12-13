package day48;

public class Hesap {
    private String no;
    private String adi;
    private String soyadi;
    private double bakiye;

    public Hesap(String no, String adi, String soyadi, double miktar) throws MiktarHatasi {
        this.no = no;
        this.adi = adi;
        this.soyadi = soyadi;
        paraYatir(miktar);
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public double paraYatir(double miktar) throws MiktarHatasi {
        if(miktar<=0) throw new MiktarHatasi();
        return bakiye+=miktar;
    }

    public double getBakiye() {
        return bakiye;
    }

    public double paraCek(double miktar) throws MiktarHatasi, YetersizBakiyeHatasi {
        if(miktar<=0) throw new MiktarHatasi();
        if(miktar>bakiye) throw new YetersizBakiyeHatasi();
        return bakiye-=miktar;
    }
}
