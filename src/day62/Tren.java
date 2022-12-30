package day62;

public record Tren(String adi,int uzunluk) implements Printable {
    @Override
    public void print() {
        System.out.println(this);
    }
}
