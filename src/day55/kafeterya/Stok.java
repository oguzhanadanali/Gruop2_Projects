package day55.kafeterya;

import java.text.Collator;
import java.util.*;

public class Stok extends ArrayList<Urun> {
    private static final Collator TR_LANG=Collator.getInstance(new Locale("tr","TR"));
    public void listele(){
        stream().forEach(urun -> System.out.println(urun));
        System.out.println();
    }

    public void isimSiraliListele(){
        stream()
                .sorted(Comparator.comparing(Urun::adi,TR_LANG ))
                .forEach(System.out::println);
        System.out.println();
    }

    public void fiyataGoreListele(){
        stream()
                .sorted(Comparator.comparing(Urun::fiyat).thenComparing(Urun::adi,TR_LANG))
                .forEach(System.out::println);
        System.out.println();
    }

    public void fiyataGoreTersSiraliListele(){
        stream()
                .sorted(Comparator.comparing(Urun::fiyat).reversed().thenComparing(Urun::adi,TR_LANG))
                .forEach(System.out::println);
        System.out.println();
    }

    public void fiyataGoreTersveMiktaraGoreTersSiraliListele(){
        stream()
                .sorted(Comparator.comparing(Urun::fiyat).reversed().thenComparing(Comparator.comparing(Urun::miktar).reversed()))
                .forEach(System.out::println);
        System.out.println();
    }

    public List<Urun> head(int n){
        return stream()
                .limit(n).toList();
    }

    public List<Urun> head(){
        return head(5);
    }

    public List<Urun> tail(int n){
        int index=size()-n;
        Objects.checkIndex(index,size());
        return stream().skip(index).toList();
    }

    public List<Urun> tail(){
        return tail(5);
    }

}
