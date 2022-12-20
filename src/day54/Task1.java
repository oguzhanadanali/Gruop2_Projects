package day54;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //1.
        List<Integer> numbers=new ArrayList<>(List.of(4,1,2,6,3,5,7,8,10,9));
        //numbers.clear();

        //2.
        ArrayList<Integer> oddNumbers=new ArrayList<>();
        ArrayList<Integer> evenNumbers=new ArrayList<>();
        for (var item:numbers){
            if (item%2==0){
                evenNumbers.add(item);
            }else {
                oddNumbers.add(item);
            }
        }

        //3.
        for(var item:numbers){
            System.out.print(item+" ");
        }

        Iterator<Integer> iterator = oddNumbers.iterator();
        //if(iterator.hasNext()) System.out.println(iterator.next());

        System.out.println();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();

        System.out.println(evenNumbers);

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%2!=0){
                numbers.remove(i);
                i--;
            }
        }

        System.out.println();
        System.out.println(numbers);

    }
}
