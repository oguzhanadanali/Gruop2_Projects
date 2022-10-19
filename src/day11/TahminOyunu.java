package day11;

import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {
        int sayi=21;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı tuttum.");
        System.out.print("Tahmininiz nedir? ");
        int tahmin = input.nextInt();
        if(tahmin<sayi){
            System.out.println("Daha büyük bir sayı giriniz.");
        } else if (tahmin > sayi) {
            System.out.println("Daha küçük bir sayı giriniz.");
        }else {
            System.out.println("Tebrikler! Bildiniz.");
        }

        System.out.println("Bitti.");
    }
}
