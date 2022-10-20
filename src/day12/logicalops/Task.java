package day12.logicalops;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //TODO: Aşağıdaki Java programını geliştiriniz.
        /*
            Verilen bir sayının hem 5'e hem de 2'ye tam bölünüp bölünmediğini bulan java programını yazınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        System.out.printf("%d sayısı 2 ve 5 ile %s\n",sayi,sayi%(5*2)==0?"tam bölünür.":"tam bölünmez.");

        //thernary operatörü
    }
}
