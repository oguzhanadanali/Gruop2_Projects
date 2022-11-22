package day34;

import java.util.Arrays;

public class MainApp1 {
    public static void main(String[] args) {
        //Jagged diziler
        /*
            1. Oturum: Dr. Ahmet, Doç. Şengül
            2. Oturum : Şahin, Eren, Fatoş
            3. Oturum : Hasan, Zeliha, Hakan, Burhan

         */
        String[][] panelistler={
                {"Dr. Ahmet", "Doç. Şengül"},
                {"Şahin", "Eren", "Fatoş"},
                {"Hasan", "Zeliha", "Hakan", "Burhan"}
        };

        System.out.println("-----------------------------");
        for (int i = 0; i < panelistler.length; i++) {
            System.out.println(panelistler[i][0]+"\t"+panelistler[i][1]);
        }

        System.out.println("-------------------------");

        int[] sayilar={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i = 0; i < sayilar.length; i++) {
            if (i%5==0) System.out.println();
            System.out.print(sayilar[i]+" ");

        }


    }
}
