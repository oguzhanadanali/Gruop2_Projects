package day46;

import java.io.File;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
            Task 1: Kayıtlı bir dosyanın var olup olmadığını kontrol edip silen Java programını yazınız.
(java.io.File sınıfı kullanılacaktır.)
Dosya'ya erişilip, ekranda gösterilecek. Silmek ister misiniz diye sorulacak.
Cevap evet ise dosya silinecek. Başarılı şekilde silindi mesajı verilecektir.
         */

        String fileName="files/deneme.txt";
        File file=new File(fileName);
        //System.out.println(file.getAbsolutePath());
        if(!file.exists()){
            System.out.println("Dosya bulunamadı.");
            return;
        }

        System.out.printf("Silinecek dosya: %s\n",file.getName());
        System.out.print("Silmek ister misiniz? [e/h] : ");
        Scanner input=new Scanner(System.in);
        String cevap = input.nextLine();
        cevap=cevap.toLowerCase();
        boolean sonuc = cevap.equals("e") | cevap.equals("evet") ? file.delete():false;
        if(sonuc){
            System.out.println("Dosya başarılı şekilde silindi.");
        }else {
            System.out.println("Dosya silinmedi.");
        }

    }
}
