package day48;

public class Daire {
    private int yaricap;

    public Daire(int yaricap) throws LengthException {
        setYaricap(yaricap);
    }

    public Daire() {
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) throws LengthException {
        if(yaricap<0) throw new LengthException();
        this.yaricap = yaricap;
    }
}
