package day33;

import java.util.Arrays;

public class MainApp2 {
    public static void main(String[] args) {
        Gezgin gezgin=new Gezgin();
        System.out.println(Arrays.toString(gezgin.addYol(10)));
        System.out.println(Arrays.toString(gezgin.addYol(20)));
        System.out.println(Arrays.toString(gezgin.addYol(70)));
    }
}
