package day62;

public class MainLambda3 {
    public static void main(String[] args) {
        Printable birSey=()-> System.out.println("Herhangi bir şey");
        printThings(birSey);

    }


    public static void printThings(Printable thing){
        thing.print();
    }
}
