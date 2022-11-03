package day22;

public class Split {
    public static void main(String[] args) {
        String cumle="Video, size görüşünüzü kanıtlamak için güçlü bir yol sunar.";
        String[] kelimeler=null;  //cumle.split(" ");
/*        for(String kelime:kelimeler){
            System.out.println(kelime);
        }*/
        //System.out.println();

        //& ve |
        //&& ve || --->short circuit
        for (int i = 0;  kelimeler!=null && i < kelimeler.length; i++) {
            System.out.println(kelimeler[i]);
        }
        System.out.println();
        int counter=0;
        while (kelimeler!=null &&counter<kelimeler.length){
            System.out.println(kelimeler[counter++]);
        }



    }
}
