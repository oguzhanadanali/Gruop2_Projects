package day10;

public class AtamaOperatorleri {
    public static void main(String[] args) {
        /*
            Atama Opratörleri
            =   : Sağındaki Literal, değişken veya herhangi bir Expression'ın sonucunu (result) solunda bulunan
            değişkene kaydeder (atama yapar).
            +=
            -=
            *=
            /=
            %=
         */

        int x=5;
        String name="Ali";
        int y=x+7;
        int z=x;

        //Bir değişkenin değerini artırıp tekrar aynı değişken içerisine saklamak
        int t=1;
        t+=1;                   //t=t+1;

        t+=3;                  //t=t+3;

        //Bir değişkenin değerini eksiltip tekrar aynı değişken içerisine saklamak
        int k=7;
        k-=2;                      //k=k-2;

        //Bir değişkenin değerini bir sayı ile çarpıp tekrar aynı değişken içerisine saklamak
        int m=8;
        m*=2; //m=m*2;


        //Bir değişkenin değerini bir sayıya bölüp tekrar aynı değişken içerisine saklamak
        int b=27;
        b/=3;                    //b=b/3;

        //Bir değişkenin değerinin modunu alıp tekrar aynı değişken içerisine saklamak

        int md=11;
        md%=2;                     //md=md%2;

    }
}
