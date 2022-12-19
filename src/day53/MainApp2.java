package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp2 {
    public static void main(String[] args) {
        List<String> aylar = new ArrayList<>(Arrays.asList("Ocak", "Şubat", "Mart"));
        List<String> gunler = List.of("Pazartesi", "Salı", "Çarşamba");//Immutable
        //gunler.add("Perşembe");
        aylar.add("Nisan");


        List<String> liste=new ArrayList<>(gunler);
        liste.add("Perşmebe");
        System.out.println(liste);

        System.out.println();
        System.out.println(aylar);
    }
}
