package day59;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        /*
            Maps,
            Anahtar=Değer
            key=value

            Örnek;
            il=Ankara

            Ankara=5M
            İstanbul=12M


            Ocak=31
            Nisan=30
         */



        Map<Integer,String> aylar=new HashMap<>();
        aylar.put(1,"Ocak");
        aylar.put(2,"Şubat");



        aylar.put(3,"Mart");
        aylar.put(4,"Nisan");
        aylar.put(5,"Mayıs");
        aylar.put(6,"Haziran");
        aylar.put(7,"Temmuz");
        aylar.put(8,"Ağustos");
        aylar.put(9,"Eylül");
        aylar.put(10,"Ekim");
        aylar.put(11,"Kasım");
        aylar.put(12,"Aralık");

        System.out.println(aylar);




        System.out.println("---------------------------");
        Set<Integer> keys = aylar.keySet();
        System.out.println(keys);
        //keys.forEach(k-> System.out.println(k));

        System.out.println("------------------------------------");
        Collection<String> values = aylar.values();
        System.out.println(values);
        //values.forEach(System.out::println);
        System.out.println("-------------------------------------");
        Set<Map.Entry<Integer, String>> entries = aylar.entrySet();
        System.out.println(entries);
/*        entries.forEach(e->{
            System.out.printf("%d ----> %s\n",e.getKey(),e.getValue());
        });*/

    }
}
