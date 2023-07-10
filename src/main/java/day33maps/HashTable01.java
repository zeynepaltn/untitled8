package day33maps;
/*
Thread-safe===>Ayni anda birden fazla is yapabilmektir.
synchronized===>Isleri mantikli bir siraya koymak.
"HashMap" ile "HashTable" arasındaki fark nedir?
1**> "HashMap" "thread-safe" değildir, "HashTable" "thread-safe" dir.
     "HashMap" "synchronized" değildir, "HashTable" "synchronized" dir.
2--> "HashMap" bir tane "null" key'e ve istediğiniz kadar "null" value'a müsaade eder.
     "HashTable" key'lerde de value'larda da "null" kullanılmasına müsaade etmez.
3--> "HashMap" hızlıdır, "HashTable" HashMap'e göre yavastir.
Note:HasMap ve HashTable ikisi de entry'leri rastgele siralar
 */

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        Hashtable<String,Integer> stdAges=new Hashtable<>();
        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",85);
        //stdAges.put(null,85); HashTable key'lerine null koyulamaz
       // stdAges.put("Chris",null); HashTable value'lerine null koyulamaz
        System.out.println(stdAges);

    }
}
