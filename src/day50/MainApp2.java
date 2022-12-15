package day50;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        ArrayList<String> liste=new ArrayList<>();
        liste.add("Ayşe");
        liste.add("Şule");
        liste.add("Betül");



        System.out.println(liste.get(0).toUpperCase());


        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

    }
}
