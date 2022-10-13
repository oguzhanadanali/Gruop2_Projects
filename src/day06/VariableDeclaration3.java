package day06;


public class VariableDeclaration3 {
    public static void main(String[] args) {
        /* -----Veri Tipleri----
            1. İlkel Tipler - Pirimitive Types
            2. Referans Tipler - Reference Types
         */



        //Tamsayı veri Tipleri
//        int sayiMax=2_147_483_647;
//        int sayiMin=-2_147_483_648;
        //Wrapper class
        long sayiMax=Integer.MAX_VALUE;
        long sayiMin=Integer.MIN_VALUE;

        System.out.println(sayiMax);
        System.out.println(sayiMin);

        //byte, short, long

        sayiMax=Byte.MAX_VALUE;
        sayiMin=Byte.MIN_VALUE;

        System.out.println(sayiMax);
        System.out.println(sayiMin);


        sayiMax=Short.MAX_VALUE;
        sayiMin=Short.MIN_VALUE;

        System.out.println(sayiMax);
        System.out.println(sayiMin);



        sayiMax=Long.MAX_VALUE;
        sayiMin=Long.MIN_VALUE;


        System.out.println(sayiMax);
        System.out.println(sayiMin);
    }
}
