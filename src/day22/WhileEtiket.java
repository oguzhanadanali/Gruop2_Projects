package day22;

public class WhileEtiket {
    public static void main(String[] args) {
        Etiket1:
        while (true){
            System.out.println("Merhaba");
            if(true){
                break Etiket1;
            }
        }

    }
}
