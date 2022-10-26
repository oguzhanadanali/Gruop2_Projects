package day15;

import java.util.Scanner;

public class MenuTasarimi {
    public static void main(String[] args) {
        //Dört İşlem Yapabilen Hesap Makinesi tasarlayınız.
        System.out.println("-".repeat(20));

        System.out.println("|    Dört İşlem    |");
        System.out.println("-".repeat(20));
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println("-".repeat(20));
        System.out.print("Seçiminiz : ");
        Scanner input = new Scanner(System.in);
        int secim= input.nextInt();
        int sonuc=0;
        String birinci="Birinci Sayı : ";
        String ikinci="İkinci Sayı : ";
        boolean flag=true;
        switch (secim){
            case 1:
                System.out.println("Toplanacak sayıları giriniz.");
                System.out.print(birinci);
                int n1=input.nextInt();
                System.out.print(ikinci);
                int n2=input.nextInt();
                sonuc=n1+n2;
                break;
            case 2:
                System.out.println("Çıkarılacak sayıları giriniz.");
                System.out.print(birinci);
                n1= input.nextInt();
                System.out.print(ikinci);
                n2=input.nextInt();
                sonuc=n1-n2;
                break;
            case 3:
                System.out.println("Çarpılacak sayıları giriniz.");
                System.out.print(birinci);
                n1= input.nextInt();
                System.out.print(ikinci);
                n2=input.nextInt();
                sonuc=n1*n2;
                break;
            case 4:
                System.out.println("Bölünecek sayıları giriniz.");
                System.out.print(birinci);
                n1= input.nextInt();
                System.out.print(ikinci);
                n2=input.nextInt();
                if (n2==0){
                    System.out.println("Geçersiz işlem yaptınız.");
                    flag=false;
                    break;
                }
                sonuc=n1/n2;
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
                flag=false;
                break;
        }
        if (flag) {
            System.out.println("Sonuç= " + sonuc);
        }
    }
}
