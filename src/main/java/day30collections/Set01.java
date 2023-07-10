package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    /*
    1)set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
    2) 3 tane Set Class vardir;
        i)HashSet Class
            Benzersiz id olusturma teknigidir. Buna "Hashing Technique" denir.
            HashSet elemanlari rastgele siralar (yani aslinda siralamaz)
            HashSet elemanlari siralamadigindan cok hizli calisir.
            HashSet ler null'i eleman olarak kabul eder.

        ii)LinkedHashset Class
            LinkedHashSet'ler elemanlari sizin verdiginiz siraya gore dizerler ve bu yuzden
            LinkedhashSet'ler tekrarsiz eleman depolamak icindir
            HashSet'lere gore daha yavastirlar. "Insertion Order" verilen siraya gore dizilmesine denir.

        iii)TreeSet Class
            TreeSet'ler elemanlari natural order'a gore dizerler, bu yuzden cok yavastirlar
            En yavas set "TreeSet" tir.
            TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz

     */
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt"); //tekrar eden eleman koydugumuzda hata vermez ama sadece bir kere yazdirir
        hs.add(null);//null'i HashSet heb en basa koyar cunku null 0 demek
        System.out.println(hs);
        System.out.println( hs.hashCode());//referans gibi bir num olusturur ve yazdirir

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println(lhs); //data'yi girdigimiz siraya gore dizer
        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls);
        lhs.retainAll(ls); //ilk LHS'deki farkli elemanlar silinir, ikisinci LHS'deki butun elemanlar kourunur
        System.out.println(lhs);//[87,124]
        System.out.println(ls);//[451,87,231,124]
        TreeSet<Character> ts=new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R'); //2 kere listeledik ama tek sefer yazdirir Java
        //ts.add(null); bunu yazarsak hata verir, treeset'ler order yaptigi icin
        System.out.println(ts);
        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z
        System.out.println(ts.lower('R'));//G , R den bir onceki eleman olan G yi verir
        System.out.println(ts.lower('D'));//A, D normalde listede yok ama olsa A dan sonra olurdu
        System.out.println(ts.higher('K'));//R, K dan sonra gelen elemani yazdirir
        System.out.println(ts.headSet('R'));//[A,G] yani R den oncekileri yazdirir
        System.out.println(ts.tailSet('G'));//[G,R,U,Z]==>parantez icindeki G dahildir
        System.out.println(ts.headSet('R', true));//[A,G,R] bu sefer inclusive'i true yaptik ve R dahil oldu
        System.out.println(ts.headSet('R', false));//[A,G]
        System.out.println(ts.ceiling('R'));//R===>eleman set'de varsa kendisi yazdirilir
        System.out.println(ts.ceiling('K'));//R===>eleman set'de yoksa alfabetik sirada bir sonraki eleman yazdirilir
        System.out.println(ts.floor('G'));//G var oldugu icin sette kendisini verir
        System.out.println(ts.floor('J'));//G, J sette yok ondan onceki elemani yazdirir
        System.out.println(ts.subSet('G', 'U'));//[G,R] substring gibi ilk parametre dahil ikinci degil
        System.out.println(ts.subSet('G', 'V'));//[G,R,U]
        System.out.println(ts.subSet('G', false, 'Z', true));//[R,U,Z]



    }
}
