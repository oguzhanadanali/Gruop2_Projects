package day60;

import org.jetbrains.annotations.NotNull;

public class Otomobil extends Thread{

    private int hiz;

    public Otomobil(@NotNull String name,int hiz) {
        super(name);
        this.hiz=hiz;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000-(hiz*10));
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
            System.out.printf(
                    "%s %d m ilerledi.\n",
                    Thread.currentThread().getName(),
                    (i+1)*10);
        }
    }
}
