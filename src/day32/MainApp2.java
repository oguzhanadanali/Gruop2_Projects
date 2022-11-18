package day32;

import day32.personelpro.Mudur;
import day32.personelpro.Personel;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Mudur md1=new Mudur();
        md1.setMaasi(10000);
        md1.iseBasla();

/*        md1.gorevYap();

        md1.molaVer();*/
        //Bir ata sınıf (Personel), kendisinden türemiş (extends) alt sınıf (Mudur) örneklerine (nesnelerine, objects) referans olabilir.
        Personel p=new Mudur();
        p.gorevYap();

        //Aşağıdakiler yanlış xxxxxxx??????!!!!!!******
        //Mudur m4=new Personel();
        //Personel p2=new Scanner(System.in);


    }


}
