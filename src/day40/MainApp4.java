package day40;

public class MainApp4 {
    public static void main(String[] args) {
        //empty ve blank

        String str="";
        System.out.println(str.length());
        if(str.isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println("Empty değil");
        }

        if(str.isBlank()){
            System.out.println("Blank");
        }else {
            System.out.println("Blank değil");
        }
    }
}
