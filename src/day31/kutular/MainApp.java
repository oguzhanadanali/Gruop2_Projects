package day31.kutular;

public class MainApp {
    public static void main(String[] args) {
        Kutu kutu1=new Kutu();
        kutu1.setGenislik(5);
        int hacim = kutu1.getHacim();
        System.out.println(kutu1);
        System.out.println("Hacim = "+hacim);

        Kutu kutu2=new Kutu(-5,3,4);
        System.out.println(kutu2);

        RenkliKutu rk1=new RenkliKutu();
        rk1.setGenislik(10);
        rk1.setRenk("Kırmızı");
        System.out.println(rk1);

        System.out.println("Renkli Kutunun Hacmi = "+rk1.getHacim());
    }
}
