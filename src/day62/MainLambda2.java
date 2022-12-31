package day62;

public class MainLambda2 {
    public static void main(String[] args) {
        Printable athing=new Printable() {
            @Override
            public void print() {
                System.out.println("Herhangi bir şey");
            }
        };

        printThings(athing);

        /*
                def kare(deger):
                    return deger*deger
                k=kare
                print k(5)


         */



    }


    public static void printThings(Printable thing){
        thing.print();
    }
}
