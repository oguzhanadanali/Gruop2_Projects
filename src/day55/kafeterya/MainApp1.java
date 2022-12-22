package day55.kafeterya;

import java.util.List;

public class MainApp1 {
    public static void main(String[] args) {
        Stok stok1=new Stok();
        stok1.addAll(Urun.stokHazirla());
        stok1.listele();
        stok1.isimSiraliListele();
        stok1.fiyataGoreListele();
        stok1.fiyataGoreTersSiraliListele();
        stok1.fiyataGoreTersveMiktaraGoreTersSiraliListele();
        List<Urun> head3 = stok1.head(3);
        List<Urun> head = stok1.head();
        System.out.println(head3);
        System.out.println(head);


        List<Urun> tail2 = stok1.tail();
        System.out.println(tail2);

    }
}
