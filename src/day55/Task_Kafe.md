Bir kafeterya için yazarkasa programı geliştirilecektir. Lütfen
aşağıdaki görevleri yerine getiriniz.

1. record ile Urun sınıfını tasarlayınız.
   Alanlar: int id, String adi, double fiyat, int miktar

2. Urun sınıfı içinde public static List<Urun> stokHazirla() metodunu tasarlayınız.
   Aşağıdaki listeyi döndürmelidir.

List.of(
new Urun(1,"Tost",2.5,50),
new Urun(2,"Çay",1.0,70),
new Urun(3,"Çorba",3.0,80),
new Urun(4,"Sütlü Tatlı",4.0,40),
new Urun(5,"Ayran",2.0,100),
new Urun(6,"Gazoz",2.0,100),
new Urun(7,"Soda",2.0,75),
new Urun(8,"Cola",2.0,120),
new Urun(9,"Baklava",5.0,30),
new Urun(10,"Salata",3.0,60),
new Urun(11,"Börek",4.0,10)
);

3. Stok sınıfını tasarlayınız. ArrayList<Urun>'den extend edilecektir.

4. public void listele() metodunu declarative olarak geliştiriniz.

5. public void isimSiraliListele() metodunu declarative olarak geliştiriniz.

6. public void fiyataGoreListele() metodunu declarative olarak geliştiriniz.

7. public void fiyataGoreTersSiraliListele() metodunu declarative olarak geliştiriniz.

8. public void fiyataGoreTersveMiktaraGoreTersSiraliListele() metodunu
   declarative olarak geliştiriniz.

9. Main class - main metodu tasarlayınız.

10. main metodu içerisinde bir stok nesnesi oluşturup   Urun.stokHazirla() metodu ile
    doldurunuz.

11. stok için tasarladığınız bütün listeleme metotlarını çalıştırınız.
    Aralarında birer satır boşluk olmasına dikkat ediniz.

12. Listenin ilk n elemanını ekranda gösteren declarative kodu yazınız.
    Method : List<Urun> head(int quantity)
    ipucu : limit

13. Varsayılan olarak ilk 5 eleman listelenmelidir.
    Method: List<Urun> head()

14. Listenin son n elemanını ekranda gösteren declarative kodu yazınız.
    Method : List<Urun> tail(int quantity)
    ipucu: skip

15. Varsayılan olarak son 5 eleman listelenmelidir.
    Method: List<Urun> tail()

16. Main class - main metodunda kodların çalıştığını test ediniz.