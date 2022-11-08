package day23;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String[] arabalar={"Toyota","Honda","Tesla","BMW","Mercedes"};

        System.out.print("Aranan araba: ");

        if(arabaBul(arabalar,new Scanner(System.in).nextLine())){
            System.out.println("Bulundu.");
        }else {
            System.out.println("Bulunamadı.");
        }









/*        System.out.print("Aranan Araba : ");
        String girdi=new Scanner(System.in).nextLine();
        boolean bulunamadi=true;
        for(String araba:arabalar){
            if(girdi.equalsIgnoreCase(araba)){
                System.out.println("Aradığınız araba bulundu.");
                bulunamadi=false;
                break;
            }
        }
        if(bulunamadi){
            System.out.println("Aradığınız araba bulunamadı.");
        }*/
    }



/*    public static boolean arabaBul(String[] arabalar,String aranan){
        boolean bulundu=false;
        for(String araba:arabalar){
            if(araba.equalsIgnoreCase(aranan)){
                bulundu=true;
                break;
            }
        }
        return bulundu;
    }*/
    public static boolean arabaBul(String[] arabalar,String aranan){
        for(String araba:arabalar){
            if(araba.equalsIgnoreCase(aranan)){
                return true;
            }
        }
        return false;
    }

}
