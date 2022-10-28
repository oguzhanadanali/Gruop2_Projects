package day18;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        String secim=showMainMenu().toUpperCase();
        switch (secim){
            case "1":
                String mathSecim=showSubMenuMath().toUpperCase();
                if (mathSecim.equals("1")){
                    //Faktoriyel hesaplama
                    System.out.print("Faktoriyeli hesaplanacak Sayı : ");
                    System.out.println("Sonuç = "+faktoriyel(new Scanner(System.in).nextInt()));
                } else if (mathSecim.equals("2")) {
                    //Mutlak Değer

                } else if (mathSecim.equals("Q")) {
                    System.out.println("Programdan çıkıldı.");
                }else {
                    System.out.println("Yanlış seçim yaptınız.");
                }
                break;
            case "2":
                String geoSecim=showSubMenuGeoCounting().toUpperCase();
                switch (geoSecim){
                    case "1":
                        //Dikdörtgen

                        break;
                    case "2":
                        //Kare

                        break;
                    case "3":
                        //Daire
                        break;
                    case "Q":
                        System.out.println("Programdan çıkıldı.");
                        break;
                    default:
                        System.out.println("Yanlış seçim yaptınız.");
                        break;
                }
                break;
            case "Q":
                System.out.println("Programdan çıkıldı.");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
                break;
        }
    }
    public static String showMainMenu(){
        System.out.println("Ana Menü");
        System.out.println("1. Matematik İşlemleri");
        System.out.println("2. Alan ve Çevre Hesaplamaları");
        System.out.println("Q. Çıkış");
        System.out.print("Seçiminiz: ");
        Scanner input=new Scanner(System.in);
        String choice=input.nextLine();
        return choice;
    }

    public static String showSubMenuMath(){
        System.out.println("Alt Menü | Matematik İşlemleri");
        System.out.println("1. Faktoriyel Hesaplama");
        System.out.println("2. Mutlak Değer Alma");
        System.out.println("Q. Çıkış");
        System.out.print("Seçiminiz: ");
        //Scanner input=new Scanner(System.in);
        //String choice=input.nextLine();
        //return choice;
        return new Scanner(System.in).nextLine();
    }

    public static String showSubMenuGeoCounting(){
        System.out.println("Alt Menü | Alan ve Çevre Hesaplama");
        System.out.println("1. Dikdörtgen");
        System.out.println("2. Kare");
        System.out.println("3. Daire");
        System.out.println("Q. Çıkış");
        System.out.print("Seçiminiz: ");
        return new Scanner(System.in).nextLine();
    }


    public static int faktoriyel(int deger){

        if (deger<2) return 1;

        int carpim=1;
        //1x2x3x4x5

        for (int i = 2; i <=deger ; i++) {
            carpim*=i; //carpim=carpim*i;
        }
        return carpim;
    }

}
