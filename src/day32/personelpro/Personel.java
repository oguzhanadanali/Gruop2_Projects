package day32.personelpro;

public class Personel {
    private int sicilNo;
    private String adi;
    private String soyadi;
    private double maasi;
    private int iseGirisYili;

    public Personel() {
    }

    public Personel(int sicilNo, String adi, String soyadi, double maasi, int iseGirisYili) {
        this.sicilNo = sicilNo;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maasi = maasi;
        this.iseGirisYili = iseGirisYili;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
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

    public double getMaasi() {
        return maasi;
    }

    public void setMaasi(double maasi) {
        this.maasi = maasi;
    }

    public int getIseGirisYili() {
        return iseGirisYili;
    }

    public void setIseGirisYili(int iseGirisYili) {
        this.iseGirisYili = iseGirisYili;
    }


    public void iseBasla() {
        System.out.println("Personel işe başladı");
    }

    public void molaVer(){
        System.out.println("Personel mola verdi.");
    }

    public void paydosYap(){
        System.out.println("Personel paydos yaptı.");
    }

    public void gorevYap(){
        System.out.println("Personel görevini yapıyor.");
    }

/*    public static void maasaZamYap(Personel personel,int zamOrani){
        if(personel==null || zamOrani<=0) return;
        double mevcutMaas= personel.getMaasi();
        personel.setMaasi(mevcutMaas+mevcutMaas*zamOrani/100);
    }*/

    public static boolean maasaZamYap(Personel personel,int zamOrani){
        if(personel==null || zamOrani<=0) return false;
        personel.setMaasi(personel.getMaasi()*(100+zamOrani)/100);
        return true;
    }

}
