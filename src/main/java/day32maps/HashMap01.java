package day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);
        //Key, tekrarli yazildiginda hata vermez, en son verilen entry'i kabul eder.
        //Bu yontem value guncellemede kulllanilabilir. Buna "overwrite" denir.
        stdAges.put("Tom",83);//ikinci yazdigim tom'u alir.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}
        //replace(), value'lari "key"leri kullanarak update etmeye yarar.
        stdAges.replace("Ezel",39);// ezel'in yasini 39 olarak degistirir
        stdAges.replace("Angelina",58,61);// ama mesela yasi yanlis girseydim degistirmezdi
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}
        //replace("Angelina",57,61) yazsaydim, Agelina 57 yasinda olmadigi icin degistirmez aynen yazilani birakir.
        //ilk replace de sadeece key e bakar ve degistirir ama ikicisinde hem key'e hem value'ye bakar ve degistirir.
        stdAges.putIfAbsent("Ali",60);//Ali'yi ve yasini eger listede yoksa ekleyen method.Varsa eklemez.
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39, Ali=60}
        System.out.println(stdAges.get("Tom"));//83.
        System.out.println(stdAges.getOrDefault("Tom", 0));//83.
        //getOrDefault(). map de var olan key'ler icin get() ile ayni ciktiyi verir, amamap de olmayan key'ler icin get()
        //null verirken getOrDefault() ikinci parametre yerine ne deger yazdiysaniz onu verir.
        System.out.println(stdAges.containsValue(77));//True. containsValue(77); methodu value'larin icerisinde 77 olup olmadigini kontrol eder.
        System.out.println(stdAges.containsValue(99));//False
        System.out.println(stdAges.containsKey("Ali"));//True. containsKey("Ali"); methodu key'lerin icerisinde Ali olup olmadigini kontrol eder.
        stdAges.remove("Ali");//Ali'yi map'den siler.Key kullanarak map'den entry'i sildik.
        System.out.println(stdAges);
        stdAges.remove("Tom", 81);//Tom 83 yasinda oldugu icin map'den cikarmaz.  Hem key'e hem value'ye bakar
        System.out.println(stdAges);
        HashMap<String,Integer> kidsAge=new HashMap<>();
        kidsAge.put("John",12);
        kidsAge.put("Jim",22);
        kidsAge.put("Jack",32);
        //stdAges.putAll(kidsAge) methodu, stdAges map'ine kidsage map'ini ekler.sdAges map'i degisir fakat
        //kidsAge map'i ayni kalir.
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAge);//{John=12, Jack=32, Jim=22}




    }
}
