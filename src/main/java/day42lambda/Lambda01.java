package day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        System.out.println(sortWithLastCharDistinctUpperInList(names));
        System.out.println(sortWithLengthReversedSameLengthInNaturalLowerinList(names));
        System.out.println(isLengthMorethanTwo(names));
        System.out.println(isAnylessThanThree(names));
        System.out.println(atLeastOneLengthLessThanFour(names));


    }//main
    //example1:List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle
    //bir List'in icinde return ediniz.
    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){
       return names.
               stream().
               distinct().
               map(String::toUpperCase).
               sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
               collect(Collectors.toList());//normalde distinct() elemanlari depolamak icin "set" kullanilir
        //ama lambda'daki toSet() elemanlari rastgele siralar, halbuki bu soruda rastgele siralama kabul edilmiyor
        //bu yuzden mecburen toList() kullandik

    }
    //Example 2:List elemanlarini character sayiarina gore ters sirada kucuk harfle bir list'in icinde return ediniz.
    // Ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun
    public static List<String> sortWithLengthReversedSameLengthInNaturalLowerinList(List<String> names){
        return names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                toList();
    }
    //Example 3:List elemanlarinin tamaminin karakter sayisinin 2 den buyuk olup olmadigini kontrol eden
    // methodu olusturunuz.
    public static boolean isLengthMorethanTwo(List<String> names){
        return names.
                stream().
                allMatch(t->t.length()>2);
        //allMatch() tester'lar tarafindan cok kullanilan bir method'dur

    }
    //Example 4: List elemanlarinin hicbirinin karakter sayisinin 3'den kucuk olmadigini kontrol eden
    //methodu olusturunuz
    public static boolean isAnylessThanThree(List<String> names){
        return names.
                stream().
                noneMatch(t->t.length()<3);
        //noneMatch() de cok kullanilir
    }
    //Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol
    //eden methodu olusturunuz.
    public static boolean atLeastOneLengthLessThanFour(List<String> names){
        return names.stream().anyMatch(t->t.length()<4);
        //anyMatch() kurala uyan herhangi bir tane ornek bulursa listedeki diger elemanlari kontrol etmez
    }








}//class
  /* Match
allMatch() ==> tum elemanlar sarti saglarsa true dondurur
anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
 */
