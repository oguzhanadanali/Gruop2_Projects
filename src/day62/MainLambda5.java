package day62;

public class MainLambda5 {
    public static void main(String[] args) {
        IMath math= (a, b) -> a+b;
        //System.out.println(math.topla(5,3));

        show(math,1,5);



        show((x,y)->x*y,5,9);
        show((x,y)->x-y,15,7);
        show((x,y)->(int)Math.pow(x,y) ,5,2);

    }


    public static void show(IMath math,int d1,int d2){
        System.out.println(math.hesapla(d1,d2));
    }
}
