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
                    System.out.print("Mutlak değeri Hesaplanacak Sayı : ");
                    int sayi=new Scanner(System.in).nextInt();
                    //System.out.printf("Sonuç = %d",sayi>=0?sayi:-sayi);
                    //System.out.printf("Sonuç=%5d",Math.abs(sayi));
                    System.out.printf("Sonuç=%5d",mutlakDeger(sayi));

                    System.out.println();
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
                        System.out.println("Dikdörtgen için;");
                        System.out.print("Uzun Kenar = ");
                        int uKenar=new Scanner(System.in).nextInt();
                        System.out.print("Kısa Kenar = ");
                        int kKenar=new Scanner(System.in).nextInt();
                        //System.out.printf("Alan =%5d\n",kKenar*uKenar);
                        //System.out.printf("Çevre =%5d\n",2*(kKenar+uKenar));

                        int alan=alanHesapla(uKenar,kKenar);
                        System.out.printf("Alan =%5d\n",alan);
                        int cevre=cevreHesapla(uKenar,kKenar);
                        System.out.printf("Çevre=%5d\n",cevre);
                        break;
                    case "2":
                        //Kare
                        System.out.print("Karenin Kenarı = ");
                        int kenar=new Scanner(System.in).nextInt();
                        System.out.printf("Alan =%5d\n",kenar*kenar);
                        System.out.printf("Çevre =%5d\n",4*kenar);
                        break;
                    case "3":
                        //Daire
                        System.out.print("Dairenin Yarıçapı = ");
                        int r=new Scanner(System.in).nextInt();

                        //                --.--
                        System.out.printf("Alan =%5.2f",Math.PI*r*r);
                        System.out.printf("Çevre =%5.2f",2*Math.PI*r);
                        int k,l,m;
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

    public static int cevreHesapla(int uk, int kk) {
        return 2*(uk+kk);
    }

    public static int alanHesapla(int uk,int kk){
        return uk*kk;
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

    public static int mutlakDeger(int deger){
        return deger>=0?deger:-deger;
    }

}
