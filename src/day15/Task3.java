package day15;

public class Task3 {
    public static void main(String[] args) {
        //Ternary op.
        int x=90;
        int y=90;
//        String mesaj=x>y?"x büyüktür":x<y?"x küçüktür.":"Her ikisi eşittir.";
        System.out.println(x>y?"x büyüktür":x<y?"x küçüktür.":"Her ikisi eşittir.");
        //System.out.println(x==y?"Her ikisi eşittir.":x<y?"x küçüktür.":"x büyüktür");

        String mesaj="";
        if(x>y){
            mesaj="x büyüktür";

        }else if(x<y){
            mesaj="x küçüktür.";
        } else {
            mesaj="Her ikisi eşittir.";
        }
        System.out.println(mesaj);


    }
}
