package day12.ifpack;

public class IfOrnek {
    public static void main(String[] args) {
        int yas=70;

        if(yas<6){
            System.out.println("Merhaba bebek!");
        } else if (yas < 13) {
            System.out.println("Merhaba çocuk!");
        } else if (yas <= 18) {
            System.out.println("Merhaba Genç");
        } else if (yas < 40) {
            System.out.println("Merhaba yetişkin");
        } else if (yas<60) {
            System.out.println("Merhaba");
        }else {
            System.out.println("Merhaba ihtiyar!");
        }


    }
}
