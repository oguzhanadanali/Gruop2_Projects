package day50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp3 {
    public static void main(String[] args) {
        Kitap k1=new Kitap(1,"Kitap 1");
        //System.out.println(k1);
        ArrayList<Kitap> kitapListesi=new ArrayList<>();
        kitapListesi.add(new Kitap(5,"Kitap 5"));
        kitapListesi.add(k1);


        kitapListesi.add(0,new Kitap(3,"Kitap 3"));


        k1=null;


        //var k=new Kitap(3,"Kitap 3");

        kitapListesi.forEach(k-> System.out.println(k));

        Kitap k=new Kitap(7,"Kiatp 7");
        var k8=new Kitap(8,"Kitap 8");

        var x=5;
        var isim="Ahmet";


        /*
        for(var k:kitapListesi){
            System.out.println(k);
        }

         */


        /*
        Iterator<Kitap> iterator = kitapListesi.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

         */


        /*
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println(kitapListesi.get(i));
        }*/

    }
}
