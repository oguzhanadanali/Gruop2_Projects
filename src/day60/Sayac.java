package day60;

public class Sayac extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" başladı.");
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
            if (i==8) System.out.println(1/0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" bitti.");
    }
}
