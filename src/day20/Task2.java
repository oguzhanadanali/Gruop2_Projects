package day20;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        String[] gunler={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
        System.out.println("Lütfen bir gün giriniz. Gün Türkçe veya İngilizce olabilir.");
        System.out.print("Gün/Day : ");

        String gun=new Scanner(System.in).nextLine();//salı
        for (int i = 0; i < days.length; i++) {
            if(gun.equalsIgnoreCase(days[i])){
                System.out.println(gunler[i]);
                break;
            }else if (gun.equalsIgnoreCase(gunler[i])){
                System.out.println(days[i]);
                break;
            }

        }
    }
}
