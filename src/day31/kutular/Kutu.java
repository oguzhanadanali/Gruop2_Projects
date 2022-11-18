package day31.kutular;

public class Kutu {
    private int genislik=1;
    private int derinlik=1;
    private int yukseklik=1;


    public Kutu() {
        this(1,1,1);
    }

    public Kutu(int genislik, int derinlik, int yukseklik) {
        setGenislik(genislik);
        this.derinlik = derinlik;
        this.yukseklik = yukseklik;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        if(genislik<1) return;
        this.genislik=genislik;
    }

    public int getDerinlik() {
        return derinlik;
    }

    public void setDerinlik(int derinlik) {
        if(derinlik>0) {
            this.derinlik = derinlik;
        }else {
            this.derinlik=1;
        }
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        if(yukseklik>0) {
            this.yukseklik = yukseklik;
        }else {
            this.yukseklik=1;
        }
    }

    public int getHacim(){
        return genislik*derinlik*yukseklik;
    }

    @Override
    public String toString() {
        return String.format("Kutu : [ %d x %d x %d ]",genislik,derinlik,yukseklik);
    }
}
