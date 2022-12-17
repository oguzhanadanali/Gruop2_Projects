package day52;

public class Urun {
    private static final int KRITIK_STOK_MIKTARI=10;
    private int id;
    private String aciklama;
    private double fiyat;
    private int miktar;

    public Urun(int id, String aciklama, double fiyat, int miktar) {
        this.id = id;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
        this.miktar = miktar;
    }

    public Urun() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getMiktar() {
        return miktar;
    }


    public void urunEkle(int miktar){
        this.miktar+=miktar;
    }

    public void urunCek(int miktar) throws StokException {
        this.miktar-=miktar;
        if(this.miktar<KRITIK_STOK_MIKTARI) throw new StokException(id,this.miktar);
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
}
