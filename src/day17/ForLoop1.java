package day17;

public class ForLoop1 {
    public static void main(String[] args) {
        int enterSayaci=101;
        for (int i = 5; i <140 ; i+=2) {
            System.out.print(i+"\t");
            if(++enterSayaci%10==0){
                System.out.println();
            }
        }
    }
}
