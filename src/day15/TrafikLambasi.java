package day15;

import java.util.Scanner;

public class TrafikLambasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Renk seçin [K,S,Y] : ");
        String renk=scanner.next();
        renk=renk.toLowerCase();


        switch (renk){
            case "k":
                System.out.println("Kırmızı");break;
            case "s":
                System.out.println("Sarı");break;
            case "y":
                System.out.println("Yeşil");break;
        }
    }
}
