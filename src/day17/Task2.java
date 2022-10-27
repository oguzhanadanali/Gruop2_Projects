package day17;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Number\tSquared");

//%5.1f
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%5d\t%5d",i,i*i);
            System.out.println();
        }
    }
}
