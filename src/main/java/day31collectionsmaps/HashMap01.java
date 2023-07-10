package day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
map'ler key-value structure'ini kullanir.
        Key         Value
     (Tekrarsiz)   (Tekrarli)
        cat=======>Evcil hayvan
        dog=======>Evcil hayvan
        Tiger=====>Kaplan
        <------Entry------>
Map'lerdeki her bir elemana entry denir
Map'lerdeki TUM elemanlara entry set denir. yukarinin tamami entry set'dir.
Map'ler "key" ve "value" structure'ini kullanir.
Key ve Value'lar farkli data type kullanabilir
HashMap'ler entry'leri rastgele siralar, bu yuzden en hizli map'dir. HashMap'ler entry'leri siralarken
key'lere bakarak siralama yapar.
Map'ler collection degildir, tamamiyla farkli bir yapidir.

Map deyince akliniza sozluk gelsin. Sozluklerde sol tarafta kelime, sag tarafta kelimenin anlami olur.
Bu sozluk yapisi Java'daki map yapisina benzer. Kelimenin oldugu sirada ayni kelimeden birden fazla bulunmaz
bu kelimeler tekrarsizdir. Sol tarafta tekrarli kelimeler yani esanlamli kelimeler olabilir. Maplerde de boyle
iki bolum olur. Ilk bolum tekrarsiz, ikinci bolumde tekrarli bolum olabilir. Tekrarsiz kisim key, tekrarli kisim
value olarak tanimlanir.

 */
public class HashMap01 {
    public static void main(String[] args) {
        //Map nasil olusturulur?
        HashMap<String,Integer> countryPopulation=new HashMap<>();
        //Map'e entry nasil eklenir?
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey",83000000);
        countryPopulation.put("Netherlands",18000000);
        System.out.println(countryPopulation);//{USA=400000000, Netherlands=18000000, Turkey=83000000, Germany=83000000, Albania=3000000}

        System.out.println(countryPopulation.get("USA"));//400000000
        //Get methodu "key" ile calisir ve bize "value"yi verir
        Set<String> keys=countryPopulation.keySet();//Key'ler tekrarsizdir,Java'da tekrarsiz seyler set icine konur
        //Butun key'leri keySet ile aliriz.
        System.out.println(keys);
        //Butun value'lari nasil alabiliriz?
        Collection<Integer> values= countryPopulation.values();
        System.out.println(values);
        //Example 1:countryPopulation map'indeki ulkelerin nufuslari ortalamasi nedir?
        Collection<Integer> value=countryPopulation.values();
        int sum=0;
        for (Integer w:value){
            sum=sum+w;
        }
        System.out.println(sum/value.size());
        Set<Map.Entry<String,Integer>> entries=countryPopulation.entrySet(); //Entry'leri set'in icine koyacak.
        System.out.println(entries);
        //entrySet()  Entry'leri alir kalip halinde set'in icine koyar.
        //Loop'lar Map'larde calismaz.Entry'leri kullanarak  loop yapmak istersek
        // once set'e ceviririz.

        //Example 2: Country population map'indeki ulkelerin isimleinin karakter sayisi ile
        //nufuslarinin toplamini bulunuz
        int toplam=0;
        for (Map.Entry<String,Integer>w:entries) {
            toplam=toplam+w.getKey().length()+w.getValue();
        }
        System.out.println(toplam);




    }
}
