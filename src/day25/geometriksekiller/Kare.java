package day25.geometriksekiller;

public class Kare {
    public int kenar;

    public int alanHesapla(){
        return kenar*kenar;
    }

    public int cevreHesapla(){
        return 4*kenar;
    }

    public void bilgiGoster(){
        System.out.printf("Alan: %d\n",alanHesapla());
        System.out.printf("Çevre: %d\n",cevreHesapla());
    }
}


