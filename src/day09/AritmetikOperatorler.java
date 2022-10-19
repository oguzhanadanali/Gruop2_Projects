package day09;

import java.util.Scanner;

public class AritmetikOperatorler {
    public static void main(String[] args) {
        /*
        Aritmetik Operatörler

        (İkili Operatörlerdir)
        +   : operand1 + operand2 Örnek; 7 <--   3+4
        -   : operand1 - operand2 Örnek; 6 <--   9-3
        *   : operand1 * operand2 Örnek; 20 <-- 4*5
        /   : operand1 / operand2 Örnek;  4 <-- 8/2
        %   : operand1 % operand2 Örnek; 1 <-- 5%2

         */


        //Statement ve expression
        int toplam=3+4;
        System.out.print("Toplam = "+toplam);

        System.out.println();
        //TASK: x,y ve z değişkenleri tanımlanacaktır. Sırasıyla 12,10 ve x+y atamalarını yapınız. Daha sonra sout.

        int x=12;
        int y=10;
        int z=x+y;

        System.out.println("x="+x+"\ny="+y+"\nz="+z);


        int a=9;
        int b=3;
        int sonuc=a-b;

        System.out.println("Sonuç = "+sonuc);


        int carpim=4*5;
        System.out.println("4 x 5 = "+carpim);

        int bolum=8/2;
        System.out.println("8 / 2 = "+bolum);

        int blm=7/2;
        System.out.println("7 / 2 = "+blm);

        int kalan=5%2;

        System.out.println("5 mod 2 = "+kalan);


        Scanner input=new Scanner(System.in);
        System.out.print("İsminiz : ");
        String isim=input.next();
        System.out.println("Merhaba "+isim);

    }
}
