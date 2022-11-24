package day36;

public class MainApp {
    public static void main(String[] args) {
        //Strings - Metin dizeleri
        //basitce bir char dizisidir denilemez.
        //Stringler immutable yani değitirilemezler

        String str1="Java";
        System.out.println(str1);
        //String s = str1.toUpperCase();

        str1=str1.toUpperCase();

        //"".getBytes(5,7,new byte[]{},10); //deprecated

        System.out.println(str1);
        //System.out.println(s);
    }
}
