package day62;

public class MainLambda4 {
    public static void main(String[] args) {
        IKare kare= a -> a*a;
        IKare k5=(int k)->k*k;

        System.out.println(kare.hesapla(6));


        System.out.println(k5.hesapla(7));
    }
}
