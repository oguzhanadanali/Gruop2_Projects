package day21;

public class ForEach {
    public static void main(String[] args) {
        String[] isimler={"Ayşe","Tarkan","Dursun","Songül"};
/*        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i]);
        }*/
        int sayac=0;
        for (String isim:isimler){
            //System.out.println(isimler[sayac++]);
            System.out.println(isim);
        }


        double[] numbers={2.3,4.5,8.0};
        double t=0.0;
        for (double n:numbers){
            t+=n;
        }
        System.out.println("Toplam= "+t);

    }
}
