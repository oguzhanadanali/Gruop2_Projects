package day29;

public class MainApp2 {
    public static void main(String[] args) {
        //Kural: Bir ata sınıf, kendisinden türetilmiş alt sınıf örneklerine referans olabilir.
        Object obj1=new Hayvan();
        System.out.println();
        Hayvan hy1=new Kedi();
        System.out.println();
        Hayvan hy2=new Koyun();
        System.out.println();
        Hayvan hy3=new Hayvan();
        Object obj2=new Kedi();


        System.out.println();
        hy1.beslen();
        System.out.println();
        hy2.beslen();
        System.out.println();
        hy3.beslen();

    }
}
