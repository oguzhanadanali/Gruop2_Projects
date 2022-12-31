package day62;

public class MainLambda6 {
    public static void main(String[] args) {
        IMath toplam= (a, b) -> {
            //Matematiksel formül kullanılması TAVSİYE olunur
            //((a+b)/2)*(b-a+1)

            return ((a+b)/2)*(b-a+1);
        };




        System.out.println(toplam.hesapla(5,9));

        MainLambda5.show((a,b)->((a+b)/2)*(b-a+1),10,20);



        IMath m= (a, b) -> a/b;


    }



}
