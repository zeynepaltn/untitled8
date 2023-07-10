package day38enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {
//verilen her listede ki her elemani 3 arttiran meyhodu yaziniz
        //INTERVIEW SORUSU

        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.println(list);
        ListIterator itr=list.listIterator();
        while (itr.hasNext()){
            Object sayi=itr.next();//object yaptik cunku kod obje ile calisiyor, iterator objesinden aldik
            itr.set((Integer)sayi+3);//(Integer) seklinde yazmamizin sebei wrapper class, oncesinde object di daha buyuk data type
        }
        System.out.println(list);

    }
}
