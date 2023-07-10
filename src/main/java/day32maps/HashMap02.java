package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
     //Example 1: TYpe a code to print the number of occurances of words in a sentence
     //I like you,like like!
     //I=1,Like=3, you=1 .Bu form key value yani map oldugu icin map olusturmaliyiz
     //Ilk once like ile like! i ayni yapmak icin butun punctuation'i silelim
     String s="I like you you, like like!";
        System.out.println(s);
     s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);
     //kelimelerle calismaliyim cunku kelime gorunum sayisi soruluyor, bu yuzden split(" ") kullanacagim
        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));
        //I=1,Like=3, you=1 .Bu form key value yani map oldugu icin map olusturmaliyiz
        HashMap<String,Integer> occ=new HashMap<>();
        //words array'indeki kelimeler irer birer map'de var mi yok mu diye kontrol edilecek.
        //words array'indeki kelimeler map' de yoksa, map'e 1 olarak yerlesirilecek
        //Map'de var ise map'de varolan value 1 artirilarak yerlestirilecek.
        for(String w:words){
            Integer numOfOccurrence=occ.get(w);
            if(numOfOccurrence==null){
                occ.put(w,1);
            }else{
                occ.replace(w,numOfOccurrence+1);//value degisirecekseniz replace kullanin
            }
        }
        System.out.println(occ);





    }
}
