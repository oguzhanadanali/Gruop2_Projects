package day22;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
/*        System.out.print("Cümle : ");
        Scanner input=new Scanner(System.in);
        while (input.hasNext()){
            System.out.println(input.next());
        }*/


        String cumle="Video, size görüşünüzü kanıtlamak için güçlü bir yol sunar.";

        Scanner input=new Scanner(cumle);
        while (input.hasNext()){
            System.out.println(input.next());
        }



    }
}
