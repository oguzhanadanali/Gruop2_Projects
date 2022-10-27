package day17;

public class Task1 {
    public static void main(String[] args) {
        int oddNumbers=0;
        int evenNumbers=0;
        for (int i = 1; i < 100; i++) {
            if(i%2!=0){
                oddNumbers+=i; //oddNumbers=oddNumbers+i;
            }else {
                evenNumbers+=i;//evenNumbers=evenNumbers+i;
            }
        }
        System.out.printf("Tek sayıların Toplamı = %d\n",oddNumbers);
        System.out.printf("Çift sayıların Toplamı = %d\n",evenNumbers);
    }
}
