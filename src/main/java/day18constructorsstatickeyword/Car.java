package day18constructorsstatickeyword;

/*
    1)Constructor nasil olusturulur ?
            Access Modifier + Clas Ismi + () + {} + ;
    2)Method ile "Constructor" arasindaki farklar nelerdir ?
            i)"Method" larda "return type" olur, "Constructor" larda olmaz.
           ii)"Method" lar yaptiklari ise gore isimlendirilirler, "Constructor" ise her zaman "Class Is"mi ile isimlendirilirler
          iii)"Method" lar bir aksiyon yapmak icin olusturulur, "Constructor" lar ise object olusturmak icindir.
         iiii)"Methid" isimleri kucuk harfle baslar, "Constructor" isimleri "Class Ismi" ile ayni oldugu icin buyuk harfle baslar
    3) Parametreli constructor lar olusturarak ayni class dan farkli ozelliklere sahip objeler olusturabiliriz
 */

public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;

    //Default Constructor
    //Default Constructor'lar "parametre" kullanmazlar
    //Default Constructor'larin body'si bostur
    //Java kiskanc'dir. Siz "default constructor"i elle yazdiginizda
    //Java Object Class icindeki default constructor'i kullandirtmaz.
    public Car(){

    }
    //Custom Constructor, kendi urettigim bir constructor
    public Car(String make, String model, int year, int price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }
}

