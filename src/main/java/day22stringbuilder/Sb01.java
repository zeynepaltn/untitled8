package day22stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1)StringBuilder String ureten bir Class'dir.
        2)String class kullanarak String uretiriz. JAVA nicin String builder class'i olusturdu?
        "String Class "immutable" string uretir. "StringBuilder" Class "mutable"(degistirilebilir) String uretir
        3)Immutable olmak demek orjinal degerin korunmasi, degistirilemez olmasi, demektir
        "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir.
        4)Capacity java'nin size verdigi data depolama yer sayisidir
        length ise size verilen data depolama yerinin kullanim kismidir
        5)java baslangic olarak size capacity'i 16 olarak verir
        siz capacity'i asarsaniz var olanin 2 katinin 2 fazlasi olacak sekilde degistirir
         */
        String s="Java"; //immutable
        s=s+"!"; //immutable larda degistirmek icin atama yapmamiz lazim
        String u="Apex";
        String v="Apex";
        String y="C++";
        //StringBuilder nasil olusturulur?
        //1.Way
        StringBuilder t=new StringBuilder("Python"); //mutable
        System.out.println(t);
        //Object ile ulasilan methodlar non-static'dir.
        //StringBuilder'a nasil ekleme yapilir?
        t.append("!");
        System.out.println(t);//Python!
        //2. Way
        StringBuilder r=new StringBuilder();
        r.append('c');
        System.out.println(r);
        //capacity ve length arasindaki fark nedir?
        //yapabileceginiz max is capacity ama sizin yaptiginiz length

        StringBuilder sb1=new StringBuilder("Money");
        int capacity=sb1.capacity();//21, 16 kutu java veriyor yazilan kelimenin yanina
        System.out.println(capacity);
        int length=sb1.length();
        System.out.println(length);//Money==>5
        sb1.append('!').append("................");
        int c=sb1.capacity();// 21x2+2=44
        System.out.println(c);
        int ln=sb1.length();
        System.out.println(ln);
        //Default capacity (16)'i degistirebilir miyiz?
        StringBuilder sb2=new StringBuilder(2);
        System.out.println(sb2.capacity());
        sb2.append("...");
        System.out.println(sb2.capacity());//6 verir.Cunku 3. noktaya yer yok ona yer acmak icinx2+2 yapacak



    }//main
}//class
