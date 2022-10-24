package day14;

public class IfStatement {
    public static void main(String[] args) {
        //Akış (Flow) kontrol ifadeleri
        /*
            if      :
            switch  :
            for     :
            while   :
         */

        /*

                if statement
                1. if (condition(s))
                        statement;

                2. if (condition(s)) {
                        statement1;
                        statement2;
                        ..
                   }
                3. if (condition(s)){
                        statement1;
                        ..
                   }else{
                        statement2;
                        ..
                   }
                4. if (condition(s)) {
                        statement1;
                        ..
                   } else if (condition(s)) {
                        statement2;
                        ..
                   }
                 5. if (condition(s)) {
                        statement1;
                        ..
                    } else if (condition(s)) {
                        statement2;
                        ..
                    } else {
                        statement3;
                        ..
                    }
                   6. if (condition(s)) {
                          satement1;
                          ...
                      } else if (condition(s)) {
                        statement2;
                        ..
                    }
                    else if (condition(s)) {
                        statement3;
                        ..
                    }
                    else if (condition(s)) {
                        statement4;
                        ..
                    }
                    ...
                    else {
                        statement_n;
                    }

                7. if (condition(s)) {
                        statement1;
                        statement2;
                        ..
                   }

                   if (condition(s)) {
                        statement1;
                        statement2;
                        ..
                   }

                   if (condition(s)) {
                        statement1;
                        statement2;
                        ..
                   }

                   if (condition(s)) {
                        statement1;
                        statement2;
                        ..
                   }
                   ...





         */


        /*
            x ve y isminde iki adet tamsayı değişkeni tanımlayınız.
            x'i 0 ile ve y değişkenini 20 ile initialize ediniz.

            Eğer y'nin değeri 20'ye eşit ise x'i 5 yapınız.


         */
        //Task 1:
        int x=1;
        int y=20;

        //x=7;

        if (y==20){
            x=5;

        }

        //System.out.println(x);

        //Task 2
        int hours=45;
        double payrate=1.0;
        if (hours>40){
            payrate *=1.5;
        }


        //Task 3
        /*
            Eğer max değişkeninin değeri false ise fees değişkeninin değerini 50 yapın
         */

        boolean max=false;
        int fees=20;
        if (!max){
            fees=50;
        }

        //Task 4
        /*
         Eğer c değişkeni 100 eşit veya 100'den büyük ise (büyük eşittir 100 ise) ve b değikeni 50'ye eşit ise
         a değişkeni 20 değerini atayınız.
         */


        //Task 5
        int temp=0;
        if (temp>=70 & temp<=80){
            System.out.println("Ideal Temp");
        }


        //Task





    }
}
