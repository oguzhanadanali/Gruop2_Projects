package day60.yaris;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Otomobil extends JComponent implements Runnable {

    private Color renk;
    private int yonX;
    public Otomobil() {
        setSize(100,50);
        int r= ThreadLocalRandom.current().nextInt(0,256);
        int g= ThreadLocalRandom.current().nextInt(0,256);
        int b= ThreadLocalRandom.current().nextInt(0,256);
        renk=new Color(r,g,b);
        yonX=5;

        new Thread(this).start();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(renk);
        g.fillRect(0,0,getWidth(),getHeight());
    }

    @Override
    public void run() {
        while (true){

            if(getX()<=0){
                yonX=5;
            }

            if (getX()>getParent().getWidth()-getWidth()){
                yonX=-5;
            }
            setLocation(getX()+yonX,getY());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }
    }
}
