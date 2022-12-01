package day40;

import java.util.Arrays;

public class Tools {
    public static void main(String[] args) {
        /*
        Task 1: Verilen bir karakter dizisini (char[]) metne çevirip döndüren metodu yazınız.
                Method: String convertToString(char[] values)
         */

        char[] dizi={'A','L','İ'};
        int[] nums={1,3,5,7};
        System.out.println(dizi);
        System.out.println(nums);
        System.out.println();
        System.out.println(convertToString(dizi));

        System.out.println(Arrays.toString(dizi));


        System.out.println(convertToString(nums));


    }

    public static String convertToString(char[] dizi) {
        String str="";
        for(char ch:dizi){
            str+=ch;
        }
        return str;
    }
    public static String convertToString(int[] values){
        String str="";
        for (int i = 0; i < values.length; i++) {
            str+=values[i];
        }
        return str;
    }


}
