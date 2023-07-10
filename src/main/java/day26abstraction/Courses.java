package day26abstraction;

public abstract class Courses {
    /*
    Interview Sorusu
    "Final keyword'u aciklar misiniz?"
   "final keyword'u Aciklar misiniz?
 1- "final keyword"==> Variable'larda  kullanilir.
   A-Variable'lerde kullaildiginde kesinlikle deger atamasi yapilmalidir.
   B- Ilk atanan deger degistirilemez.

 2- "final keyword"==> Method'larda kullanilir
   A- O method'un body'si degistirilemez.
   B- o method Override edilemez.

 3- "final keyword"==> Class'larda kullanilir
   A- O class'in child class'i olamaz. Ama final class'in kendigis child olabilir.

     */
    public abstract void math();
    /*
    1)Bazen parent class'taki method'un body'si hic bir child class tarafindan kullanilmaz, bu
    durumda parent'daki method'a body yazmak hic kullanilmadigi icin mantikli degildir. Biz de
    o method'a body yazmayiz.
    2)Body'si yazilmayan method'a "abstract method" denir. Abstract ingilizce de vucutsuz veya soyut anlamindadir.
    3)Method'un body'sini yazmayinca Java hata verir, Biz de abstract keyword'unu kullanarak bu methoud'un
    body'si olmayacak deriz.
    4)Abstract keyword'unu kullaninca elde ettigimiz abstract method normal class'lara knulmaz,
    o yuzden class'i da abstract yapariz.
    6)parent'daki method abstract ise butun child'ler o method'u override etmek zorundadir, bu yuzden tum child'lar icin
    mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir
    7)Abstract keyword ile method body bir method'da ayni anda kullanilamaz
    8)Abstratc class larin icinde abstratc methodlar olur. abstract methodlar body'si olmadigi icin eksik birakilmis method gibi dusunulebilir
    yani abstract class icinde eksik bir yapi barindirir. siz abstract class dan obje uretirseniz class daki
    eksiklik objeye yansir ve obje eksigi olan bir obje olmus olur, bu da application in yanlis calismasina sebep olur
    java app'i korumak icin abstarct class'lardan  object uretilmesini engellemistir
    9)Abstract larin constarctor'i var ama object olusturamazlar
    10)Final method'lar abstract olamazlar.
    11)private methodlar abstract olamazlar
    12) "abstract class"ın child class'ı "Concrete" veya "Abstract" olabilir.
     */
    //body'si olan methodlar (concrete method) abstract class larin icine yazilabilir art() ornegin
    //abstract methodlar concrete class'a yazilamazlar
    public void art(){
        System.out.println("Learn art");

    }

}
