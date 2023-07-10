package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        /*
        ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.

LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
oldugu icin. Elemanlarin yapisi farkli olup bunlara Node (eleman yerine) denir. Yapinin bir yuzune point, on yuzune
ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.
NOTE:LinkedList'ler "index" kullanmazlar
NOTE:ArrayList'ler eleman bulmada cok basarilidir , LinkedList'ler ise node bulmada basarisizdir
ekleme ve cikarmada ise LinkedList'ler daha basarilidir.

1)LinkedList'ler node silme ve ekleme de cok basarili olduklari icin, silme ve ekleme islemlerini coklukla yapacaginiz zaman
  LinkedList kullaniniz
 2)ArrayList'ler index'leri adres gibi kullanir bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
NOTE:Ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa(muze ziyaretcileri gibi)LinkedList,
     "search" islemleri yapacaksa(Amerika eyaletleri gibi)ArrayList kullaniniz

         */
        LinkedList<String> s= new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen"); //elemani "Ajda" ile "Muge" arasina koydurur 2, yani Esen nod 3 haline gelir
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        System.out.println(s); //[Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]
       // s.remove(2); //index'ler 0 dan baslar o yuzden Steve silinir
        //s.remove("Ajdar"); //belirtilen object silinir
        //s.remove(); //parametresiz remove methodu ilk elemani siler yani Kemal
        //s.removeFirstOccurrence("Esra");
        //s.removeLastOccurrence("Esra");
        System.out.println(s);
        String r1=s.peek(); // Ilk elemani silmeden size verir, copy paste gibi
        System.out.println(r1);
        String r2=s.poll();//Ilk elemani size verir ve List den siler, cut paste gibi
        System.out.println(r2);
        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
        Throws:NoSuchElementException – if this list is empty
        NOTE: peek() ile element() ikiside ilk elemani silemden size verir, ama peek list bos oldugunda
        size null verir, element ise hata verir
         */
        String r3=s.element(); //Ilk elemani silemden size verir, copy paste gibi
        System.out.println(r3);

        /*
        Removes and returns the first element of this list.
        Throws: NoSuchElementExceptin=if this list is empty
        NOTE: poll() ile pop() ikiside ilk elemani silemden size verir, ama poll() list bos oldugunda
        size null verir, pop() ise hata verir
         */
        String r4=s.pop();
        System.out.println(r4);
        //hashset en hizli set, hiz ihtiyacinda kullanilir
        //linkedhashset elemanlari sizn girdiginiz siaraya gore dizer
        //treeset elemanlari natural order a gore dizer


    }
}
