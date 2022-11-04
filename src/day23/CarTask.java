package day23;

import java.util.Random;
import java.util.Scanner;

public class CarTask {
    public static void main(String[] args) {
        do {
            Random rnd = new Random();
            String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
            for (int i = 0; i < cars.length; i++) {
                System.out.printf("%d. %s\n", i + 1, cars[i]);
            }
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = new Scanner(System.in).nextInt();
            int fiyat = 0;
            switch (secim) {
                case 1:
                case 2:
                case 3:
                    fiyat = rnd.nextInt(20000, 40000);
                    break;
                case 4:
                case 5:
                    fiyat = rnd.nextInt(50000, 80000);
                    break;
                case 6:
                case 7:
                    fiyat = rnd.nextInt(100000, 150000);
                    break;
            }

            if (secim >= 1 & secim <= 7) {
                System.out.printf("Seçtiğiniz araba   %s, fiyatı %d. İyi günlerde kullanın.\n", cars[secim - 1], fiyat);
                break;
            } else if (secim == 0) {
                System.out.println("Program sonlandırıldı.");
                break;
            } else {
                System.out.println("Yanlış seçim yaptınız.");
            }
        }while (true);
    }
}
