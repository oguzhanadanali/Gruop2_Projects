package day56;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        List<String> ulkeler=new ArrayList<>();
        Collections.addAll(ulkeler,
                "Türkiye",
                "Çin",
                "Amerika",
                "İngiltere"
        );
        ulkeler.forEach(System.out::println);
        System.out.println();
        ulkeler.sort(Collator.getInstance(new Locale("tr","TR")));
        ulkeler.forEach(System.out::println);


        System.out.println("---------------------------------------");
        List<String> liste = List.of("Türkiye", "Çin", "Amerika", "İngiltere");
        liste.forEach(System.out::println);
        //liste.remove(0);
        //liste.sort(Collator.getInstance(new Locale("tr","TR")));
    }
}
