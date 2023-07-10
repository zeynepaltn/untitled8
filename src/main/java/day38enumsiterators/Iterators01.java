package day38enumsiterators;

import java.util.*;

public class Iterators01 {
    /*
    1)Iterator'lar loop'larin yapigi ayni isi yapar.
    2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
    3)Iterator'lar ile loop'lar arasinda performance farki yoktur. (Biri daha hizli biri yavas diyemeyiz)
    4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha
    basarilidir.
    5)Iki tip iterator var; i)Iterator:bu sadece eleman silmede kullanilir, eleman eklemek veya elemani
                               degistirmek mumkun degildir.
                            ii) ListIterator:Bu eleman silebilir,ekleyebilir ve degistirebilir.
    NOTE:"Iterator" sadece soldan saga calisir. (for each loop gibi). "ListIterator" ise iki yonlu alisabilir.
     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);
        //"Iterator" kullanalim ve listeyi iterator' a donusturelim
        Iterator<String>  myItr=myList.iterator();
        while(myItr.hasNext()){//hasNext pointer'a senden sonra eleman var mi diye sorar. Eleman varsa true
                              // yoksa false dondurur
            myItr.next();//pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder
            myItr.remove();//next() methodunun return ettigi elemani siler
            //remove methodu uzerinden altladigi elemani siler.Ancak uzerinden atladigi eleman yoksa hata verir.
            //IllegalStateException hatasi verir. Bu nedenle ust uste iki kez remove methodu kullanilmaz.

        }
        System.out.println(myList);
        //listIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");

        System.out.println(yourList);
        ListIterator<String> yourListItr=yourList.listIterator();
        while (yourListItr.hasNext()){
            String el=yourListItr.next();
            yourListItr.set(el+"!");// set method'u list'i update etmye yarar

        }
        System.out.println(yourList);
        //hasPrevious() ve previous() nasil kullanilir?
        //pointor en sonda deilse bu iki methodu kullanmanin anlami yok
        while(yourListItr.hasPrevious()){
            String el=yourListItr.previous();
            yourListItr.set("?"+el);

        }
        System.out.println(yourList);

        //En sondan en basa nasil iterate edebiliriz?
        //INTEVIEW SORUSU OLABILIR
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);
        Iterator<String> ourListItr=ourList.descendingIterator();
        while(ourListItr.hasNext()){
            String el=ourListItr.next();
            System.out.println(el);
//descendingIterator() otomatik olarak pointer'i en sona koyar ve islem sondan baslar
//descending sondan basa (azalan) siralama. descending sadece LinkedList ile kullanilir, yoksa calismaz
            //ArrayList ile calismaz.
        }


    }
}
