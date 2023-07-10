package day31collectionsDT;


import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
/*
1)Arraylist'ler eleman ekleme ve silmede basarisizdirlar.Bu sebeple cokca eleman ekleme cikarma
yapilacaksa tavsiye edilmezler.
2)LinkedList'ler index kullanmadiklari icin re-index yapmasina gerek yoktur.Bu yuzden eleman (node) ekleme ve cikarma yapmadad
basaridirlar. Bu yuzden eleman (node) ekleme ve cikarmada LinkedList tavsiye edilir.
3)Arraylist'lerde "search islemi"cok kolay yapilir, cunku index'ler adres gibidir.
4)LinkedList'lerde search islemi zor yapilir, cunku LinkedList'ler index kullanmazlar.
  Index kullanmayinca herhangi bir elemani bulmak icin en  bastan sona dogru tum elemanlar kontrol edilir
  bu da cok fazla is demektir.
 */
        LinkedList<String> s=new LinkedList<>();
        s.add("Merve");
        s.add("Murat");
        s.add("Vildan");
        s.add("Fatih");
        s.add("Mustafa");
        s.add("Fatih");
        System.out.println(s);
        s.add(1,"Caner");//1. indexe Caner'i yerlestirir
        System.out.println(s);
        s.addFirst("Ahmet");
        System.out.println(s);// En basa Ahmet'i yerlestirir
        s.addLast("Enver");
        System.out.println(s);// En sona Enver'i yerlestirir
       /* s.remove(2);//2. index'dekini kaldirir
        System.out.println(s);*/
        //s.remove("Ahmet");   Ahmet'i kaldirir
        //System.out.println(s);
        s.removeFirstOccurrence("Fatih"); //ilk gorunen Fatih'i siler
        System.out.println(s);
        String r1=s.peek(); //Ahmet.Retrieves, but does not remove, the head (first element) of this list, or
        //null if this list is empty. Bu yuzden peek()'i copy+paste gibi dusunebiliriz
        System.out.println(r1);
        String r2=s.poll();//Ahmet. Daha sonra AHmet'i listeden sildi. cut+paste gibi.
        System.out.println(r2);
        String r3=s.element();//Merve. element'de silmeden ilk elemani verir, peek() gibi.Peek'den
        //farkli olarak eger liste bos ise null vermez hata verir
        System.out.println(r3);
        System.out.println(s);
        String r4=s.pop();
        System.out.println(r4);//Merve (ilk node) verir ve listeden siler..Poll'e benzer tek farki
        //poll list bos ise null verir, pop ise exception(hata) verir.
        System.out.println(s);


    }

}
