package day35;

public class Aslan extends Hayvan implements Avci,Yuzucu {

    @Override
    public void avlan() {
        System.out.println("Aslan avlanıyor.");
    }

    @Override
    public void yuz() {
        System.out.println("Aslan yüzüyor.");
    }
}
