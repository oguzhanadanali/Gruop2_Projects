package day57;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Sanatci> sanatcilar = Arrays.asList(
                new Sanatci("Şener Şen", 73),
                new Sanatci("Kemal Sunal", 82),
                new Sanatci("Filiz Akın", 116),
                new Sanatci("Fatma Girik", 180),
                new Sanatci("Kadir İnanır", 182),
                new Sanatci("Hülya Koçyiğit", 200),
                new Sanatci("Sadri Alışık", 209),
                new Sanatci("Münir Özkul", 215),
                new Sanatci("Türkan Şoray", 222),
                new Sanatci("Ali Şen", 290),
                new Sanatci("Cüneyt Arkın", 400),
                new Sanatci("Hulusi Kentmen", 500),
                new Sanatci("Erol Taş", 600),
                new Sanatci("Gülşen Bubikoğlu", 50),
                new Sanatci("Ediz Hun", 130),
                new Sanatci("Adile Naşit", 300),
                new Sanatci("Tarık Akan", 111)
        );

        long toplamSanatci = sanatcilar.stream().count();
        System.out.println("Toplam Sanatçı adedi : "+toplamSanatci);

        long az100 = sanatcilar.stream()
                .filter(s -> s.filmAdedi() < 100).count();
        System.out.println("100'den az filmi olan sanatçı adedi : "+az100);

        List<Sanatci> az100List = sanatcilar.stream()
                .filter(s -> s.filmAdedi() < 100)
                .collect(Collectors.toList());
        az100List.stream()
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

        sanatcilar
                .stream()
                .sorted(Comparator.comparing(Sanatci::isim,
                        Collator.getInstance(new Locale("tr","TR"))))
                .forEach(s-> System.out.println(s));

        System.out.println();
        Sanatci enCokFilm = sanatcilar
                .stream()
                .max(Comparator.comparing(Sanatci::filmAdedi)).get();
        System.out.println("En çok filmi olan sanatçı : "+enCokFilm);

        Sanatci enAzFilm = sanatcilar
                .stream()
                .min(Comparator.comparing(Sanatci::filmAdedi)).get();
        System.out.println();

        System.out.println("En az filmi olan sanatçı : "+enAzFilm);

        System.out.println();
        double ortalamaFilmAdedi = sanatcilar
                .stream()
                .mapToDouble(Sanatci::filmAdedi).average().getAsDouble();
        System.out.println("Sanatçıların film ortalaması : "+Math.round(ortalamaFilmAdedi));

        int sum = sanatcilar
                .stream()
                .mapToInt(Sanatci::filmAdedi).sum();
        System.out.println("Toplam film adedi : "+sum);

        //İsmi A ile başlayan 300 ve üzeri filmi olan sanatçı listesi
        List<Sanatci> a300 = sanatcilar
                .stream()
                .filter(s -> s.isim().startsWith("A"))
                .filter(s -> s.filmAdedi() >= 250)
                .sorted(Comparator.comparing(Sanatci::filmAdedi).reversed())
                .toList();
        System.out.println("-----------------");
        System.out.println(a300);


    }
}

record Sanatci(String isim, int filmAdedi){}
