package day41;

public class MainApp {
    public static void main(String[] args) {
        //StringBuffer
        StringBuffer sb=new StringBuffer(50);

        sb.append("Kardeş");
        sb.append("Kardeş");
        sb.append("Kardeş");
        sb.append("Kardeş");
        sb.append("Kardeş");
        sb.append("Kardeş");
        sb.append("Kardeş");
        sb.append("Kardeş");
        sb.append("Kardeş");

        sb.trimToSize();


        System.out.println(sb);
        System.out.println("Length   : "+sb.length());
        System.out.println("Capacity : "+sb.capacity());
    }
}
