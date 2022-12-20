package day54;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Book> kitapListesi=new ArrayList<>(List.of(
                new Book(1,"Sefiller",55),
                new Book(2,"Java 8",70),
                new Book(3,"C#",45)
        ));

        //Fiyatı 50'den büyük olan kitapları listeleyiniz.



        /*
                Imperative approach and declarative approach
         */

        //Imperative
/*
        for (int i = 0; i < kitapListesi.size(); i++) {
            Book b=kitapListesi.get(i);
            if (b.price()>50){
                System.out.println(b);
            }
        }
*/

        //declarative
        kitapListesi.stream()
                .filter(item->item.price()>50)
                .forEach(item-> System.out.println(item));


        //Fiyatı 50'den küçük olanların sayısı nedir?




/*        int toplam = topla(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Toplam= "+toplam);*/
    }


    public static int topla(int...sayilar){
        int toplam=0;

        for (var item:sayilar){
            toplam+=item;
        }
        return toplam;
    }

}


record Book(int id,String name,double price){}
