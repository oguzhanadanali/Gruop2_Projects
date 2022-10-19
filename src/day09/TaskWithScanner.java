package day09;


import java.util.Scanner;

public class TaskWithScanner {
    public static void main(String[] args) {
        /*
        TASK: Klavyeden girilen iki sayının çarpımını bulup, ekrana yazan bir Java programı tasarlayınız.
         */

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");

        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int sayi2 = input.nextInt();
//        int carpim = sayi1 * sayi2;
        System.out.println("Sayıların Çarpımı = "+(sayi1*sayi2));
    }
}
