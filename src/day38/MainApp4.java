package day38;

import java.util.Scanner;

public class MainApp4 {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz : ");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();

        if(isPalindrome(sayi)){
            System.out.printf("Girdiğiniz sayı %d bir palindrome'dur.\n",sayi);
        }else {
            System.out.println("Girilen sayı palindrome değildir.");
        }

    }


    public static boolean isPalindrome(int sayi){
        boolean result=false;
        int tmp=sayi;
        int kalan=0;
        int rev=0;
        while (sayi>0){
            kalan=sayi%10;
            rev=rev*10+kalan;
            sayi=sayi/10;
        }
        result=tmp==rev;
        return result;
    }

}
