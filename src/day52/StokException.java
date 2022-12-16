package day52;

public class StokException extends Exception{
    private int id;
    private int miktar;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public StokException(int id, int miktar) {
        super(String.format("Stok miktarı azaldı. Id: %d, Miktar: %d",id,miktar));
        this.id = id;
        this.miktar = miktar;
    }

    public StokException() {
        super("Stok miktarı azaldı.");
    }
}
