package day57;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        //1. ArrayList

        ArrayList<Integer> numbers=new ArrayList<>();


        //2. List.of metodu
        List<Integer> numbers1=List.of(1,2,3,4,5);

        //3. Arrays.asList
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        //4. Collections.addAll
        Collections.addAll(numbers,1,2,3,4,5);

        numbers.add(6);
        numbers.add(0,7);

        System.out.println(numbers);

        numbers.addAll(integers);

        System.out.println(numbers);

        numbers.addAll(6,numbers1);

        System.out.println(numbers);


        System.out.println("Numbers size: "+numbers.size());


        Integer integer = numbers.get(0);
        System.out.println("İlk eleman : "+integer);

        numbers.forEach(number-> System.out.printf("%d x %d = %d\n",number,number,number*number));
        System.out.println("--------------------------------");
        numbers.forEach(item->{
            int kare=item*item;
            System.out.println(kare);
        });

        System.out.println("--------------------");
        Iterator<Integer> iterator = numbers.iterator();
        if(iterator.hasNext()) System.out.println(iterator.next());
        System.out.println("--------------------------");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();
        System.out.println("--------------------------");
/*        Object[] objects = numbers.toArray();

        System.out.println(Arrays.toString(objects));*/

        int[] dizi={1,2,3,4,5,3,5,5,6,1,2};



        long count = Arrays.stream(dizi).count();
        long dist = Arrays.stream(dizi).distinct().count();


        System.out.println("Eleman Sayısı = "+count);
        System.out.println("Distinct adedi = "+dist);

        Integer[] integers1 = numbers.toArray(new Integer[0]);
        int sum = Arrays.stream(integers1).mapToInt(Integer::intValue).sum();
        double average = Arrays.stream(integers1).mapToDouble(Integer::intValue).average().getAsDouble();
        System.out.printf("Toplam = %d\tOrtalama = %5.2f\n",sum,average);




        numbers.set(0,-5);
        System.out.println("-----------------");

        System.out.println(numbers);

        System.out.println("-----------------");

        numbers.set(0,null);
        Integer remove = numbers.remove(0);
        System.out.println("Silinen Nesne (Sayı)  :"+remove);

        System.out.println(numbers);

        if (numbers.remove((Integer) 1)){
            System.out.println("Sayı silindi.");
        }else {
            System.out.println("Sayı silinemedi.");
        }

        System.out.println(numbers);


/*        numbers.removeAll(List.of(1));
        System.out.println(numbers);*/

        numbers.removeIf(item->item==1);
        System.out.println(numbers);
    }
}
