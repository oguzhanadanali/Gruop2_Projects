package day47;

public class MainApp {
    public static void main(String[] args) {
        /*
            Task 1: Verilen bir String dizisinin içeriğini ekrana bastıran metodu yazınız.
            - Method: void showContent(String[] values)
            - Metot içerisinde iki adet uncheck Exception kullanılacaktır.
             - NullPointerException - ArrayIndexOutOfBoundsException
            - try - catch - catch
         */


        String[] isimler={"Ahmet","Seba","Hakan","İlhan"};
        isimler=null;
        showContent(isimler);

    }


    public static void showContent(String[] values){
        try {
            for(int i=0;i< values.length;i++){
                System.out.print(values[i]+"\t");
            }
            System.out.println();
        }catch (NullPointerException|ArrayIndexOutOfBoundsException ex){
            //System.err.println(ex.getMessage());
            if(ex instanceof NullPointerException){
                System.out.println("SMS gönderildi. Hata: "+((NullPointerException) ex).getMessage());
            } else{
                System.out.println("Email gönderild. Hata: "+((ArrayIndexOutOfBoundsException) ex).getMessage());
            }
        }
    }

}
