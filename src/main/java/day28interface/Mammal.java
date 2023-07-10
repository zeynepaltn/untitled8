package day28interface;
/*
    1)
      CHILD    PARENT
      Class--->Class:extends
      interface--->interface:extends
      class--->interface:implements
      interface--->class:olamaz
      Ayni ise "extends", farkli ise "implements" kullan
      "interface'i" class'in child'i yapma kurali.
      ///////**************\\\\\\
      ABSTARCT CLASS ILE INTERFACE ARASINDAKI FARKLAR NELERDIR? (INTERVIEW SORUSU)
      1)Abstarct Class'lar hem abstract hem de concrete methodlar icerebilir,fakat
      inetrafce'ler sadece method icerir. Ama istersek default ve static keywordleri kullanarak concrete method
      uretebiliriz.
      2)Abstarct class'lar multiple inheritence'i desteklemez ama interface'ler destekler.
      3) Abstarct class'lar icinde her turlu variable olusturulabilir, interface'ler icindeki variable'lar
      public ,static ve final olmak zorundadir.
      4)"Interface" class'in chil'i olamaz, fakat "abstract class" class'in child'i olabilir.
      5)Abstract class'larda constructor vardir fakat object uretmezler, interface'lerde constructor
      yoktur bu yyuzden object uretilmez.
 */


public interface Mammal extends Animal{
String feedBaby="Milk";
int age=6;
}
