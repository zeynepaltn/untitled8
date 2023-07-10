package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniqueLoweCaseSortWithLength(myList);

    }
    //Example 1: Bir List'teki elemanlari console'a yazdiran methodu olusturunuz.
    //1. Yol
    public static void printElements(List<String> myList){//Methodlarla beraber bir yapi kurduk, bu programlama tarzina
                                                           //Structured Programming denir
        for(String w: myList){
            System.out.print(w+" ");

        }

    }

    //2.Yol
    public static void printEl(List<String> myList){
        myList.stream().forEach(t-> System.out.print(t+" "));//Sadece methodlarin kullanildigi mimarinin(yapinin) onemsiz oldugu
                                                             //programlama tarzina functional Programming denir. LAMBDA functional programming'dir
    //stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir. Datalari akisa alir
    }
    //Example2: Bir Lis'dek T ile baslayan elemanlar haric tum elemanlari konsola yazdiran kodu olusturun.
    public static void printElExceptStartsWithT(List<String> myList){
        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t+" "));

    }
    //Example 3:Bir List'de karakter sayisi 4 den az olan tum elemanlari konsola yazdiriniz
    public static void printElLengthLessThanFour(List<String> myList){
        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t+" "));
    }
    //Example 4:Bir List'deki karakter sayisi 4 den cok olan elemanlari buyuk harflerle konsola yazdiran kodu yaziniz
    public static void printElLengthMoreThanFourWithUpper(List<String> myList){
        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t+" "));

    }
    //Example 5:Bir List'deki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle
    //konsola yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.stream().
                filter(t->t.length()>4).
                distinct().
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t+" "));
    }
    //Example 6: Bir List'deki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada konsola yazdiriniz
    public static void printElUniqueToUpperCaseSorted(List<String> myList){
        myList.stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));
    }
    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina kucukten buyuge
    // siralayarak console'a yazdiran method'u olusturunuz.
    public static void printElUniqueLoweCaseSortWithLength(List<String> myList){
        myList.stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).//elemanlari uzunluklarina gore siralar
                forEach(t-> System.out.print(t+" "));
    }

}
//distinct()tekrarli elemanleri bir kere gosterir.
//map() var olan elemani degistirir (uppercase, lowercase etc..)
//filter() butun elemanlari gozden gecirir ve istenilen disindaysa secmez, kisaca filtreleme yapariz
//sorted() natural order yapar. String data'lar icin A-Z, integer data'lar icin 1-9999..