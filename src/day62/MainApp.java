package day62;

public class MainApp {
    private static int deger;
    public static void main(String[] args) {
        //System.out.println(topla(5,3));
        Mathe m=new Mathe(5,3);
        System.out.println(m.topla());



        int x=5;
        int y=7;
        int z=x+y;

    }


    public static int topla(int a,int b){
        a=a*2;
        return a+b;
    }
}

class Mathe {
    private final int x;
    private final int y;

    private int durum;


    Mathe(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int topla(){
        return x+y;
    }

}
