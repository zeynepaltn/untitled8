package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);
        //Array list de bir eleman in ilk gorunumunu nasil sileriz?
        cities.remove("Miami"); //1. Miami iyi siler
        System.out.println(cities);
        //Array List de index kullanarak elaman nasil sileriz?
        cities.remove(2); //method overloading e de guzel bir ornek
        System.out.println(cities);
        //Method ogrenirken 3 sey aklinizda olsun.
        //O method ne iş yapar?
        // O method nasıl kullanılır?
        // O method size neyi verir?
        //Array List olustururken en basa sadece List de yazabiliriz
        List<Integer> ages=new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(27);
        ages.add(4);
        //Example 12 elaminini ages list den siliniz.
        ages.remove((Integer)12); //Wrapper class 12 yaptik, obur turlu index algilar
        System.out.println(ages);
        //List in icindeki butun giresun ve yozgat lari yani butun gorunumleri siliniz
        List<String> citiesToRemove=new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");
        System.out.println(cities.removeAll(citiesToRemove)); //true verir
        System.out.println(cities);
        //iki Array List in birbirine esit olup olmadigini nasil anlariz?
        List<Character> initials=List.of('a','k','c','d','k'); //List.of method kullanarak kisa yoldan eleman listeleyebiliriz
        System.out.println(initials);
        List<Character> letters=List.of('a','c','k','d','k');
        boolean r1=initials.equals(letters);
        System.out.println(r1); // false verecek
        //hem elemanlar ayni mi hem index ler ayni mi diye baktigi icin false
        int r2=initials.indexOf('k'); // 1 verecek. yani k nin ilk gorundugu index
        System.out.println(r2);
        int r3=initials.lastIndexOf('k'); // 4. yani k nin son gorundugu index
        System.out.println(r3);
        //Example 1:Bir List deki tekrarsiz elemanlari konsola yazdirankodu yazin
        List<Double> prices= List.of(2.5,1.25,2.5,3.75,1.25,4.0);
        for(Double w:prices){
            if(prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.print(w+" ");

            }
        }
        System.out.println();
        //Example 2: Bir list de tekrarli eleman olup olmadigini gosteren kodu yazin
        List<Double> heights= List.of(2.5,1.25,2.5,3.75,1.25,4.0);
        int counter=0;
        for(Double w: heights){

            if(heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;

            }
        }
        if(counter==0){
            System.out.println("all elements are unique in the list");

        }else{
            System.out.println("at least one element is not unique in the list");
        }
    }
}
