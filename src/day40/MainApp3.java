package day40;

public class MainApp3 {
    public static void main(String[] args) {
        //replace
        String isim="Mehmet Ali Erbil";
        String replace = isim.replace('e', 'i');
        System.out.println(replace);
        String replace1 = isim.replace("Erbil", "Birand");
        System.out.println(replace1);
        System.out.println(isim);
    }
}
