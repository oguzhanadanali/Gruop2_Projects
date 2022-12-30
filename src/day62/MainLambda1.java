package day62;

public class MainLambda1 {
    public static void main(String[] args) {
        Araba a1=new Araba("Honda",5000);
        printThings(a1);
        printThings(new Araba("Toyota",3000));
        printThings(new Tren("Yolcu Trein",1500));
    }


    public static void printThings(Printable thing){
        thing.print();
    }

}
