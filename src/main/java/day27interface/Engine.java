package day27interface;
/*
            INTERFACE'DEKI METHOD'LAR
   1)Interface icerisine concrete method konulamaz.
   2)"Interface" icindeki methodlarin abstract olsugunu java bilir, bu yuzden
   "interface" icindeki "abstarct method" larda "abstract" keyword kullanmaya gerek yoktur
   3)Interface icindeki abstract methodlarin tamami public'dir. Bu yuzden interface icinde abstract
   method olustururken acces modifier yazmaya gerek yoktur
   4)Bir interface'i bir class'in parent'i yapmak istedigimize extend keyword
   yerine implement keywor'u kullaniriz.
   5)concrete child class'lar, parent interface'deki abstract methodlari override etmek
   zorundadirlar
   6)Interface'lar bir app'da "concrete child class" larin yapmak zorunda olduklari
   foknsiyonlari barindirirlar. Bu yuzden interface'lere "to -do" list de denir.
   7)Birden fazla "parent Interface" icinde ayni isimli "abstarct methodlar" olusturabilirsiniz
   Abstract methodlarin body'si olmadigi icin child class'lar ayni isimli method'lardan
   herhangi birini override ederek kulanabilirler
   8)Brden fazla "parent interface" icerisinde ayni isimli abstarct methodlar olusturdugunuzda
   bu methodlarin return typ lari ayni olmak zorundadir
   9)Normalde interface icerisine concrete method konulamaz fakat bazi ozel durumlarda
   Interface'ler icerisine concrete method koymak istersek "default" keyword kullaniriz
   10)Dfault veya static keyword'unu kullanarak olusturdugumuz concrete methodlarin, concrete child class'lar
   tarafindan kullanilma zounlulugu yoktur.
   11)"defaul" keywordunu kullanarak olusturdugumuz concrete method'lara object olusturarak ulasilabilir
      "static" keywordunu kullanarak olusturdugumuz concrete method'lara ulasmak icin object olusturmaya gerek
      yoktur. "interface ismi yeterlidir"
   12)Interface'lerden object olusturulamaz. Interface'lerin constructor'i yoktur.

 */

public interface Engine {
    void start(); //madde 3 burada
    void payment();
    default void echo(){ //body'si olan bir method konulabilir, default kelimesi kullanarak
                         //buradaki default AM degildir. madde 9 burasi
        System.out.println("uses less gas...");
    }
    static void stop(){
        System.out.println("Stops securely..."); //diger ornek de static keywordu. Madde 9.
    }

}
