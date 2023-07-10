package day24inheritencepolymorphism;
/*
1) Inheritance da object constructor'lar yukaridan (parent)
asagiya (child) dogru calisirlar
2)Parent ve super, es anlamlidir. Child ve Sub, es anlamlidir
3)Super() her constructor 'in ilk satirinda gorunmez olarak bulunur.
4)super() her constructor in ilk satirinda bulunur ve bizi parent daki constructor a tasir
5)this() sizi ayni class icindeki constructor lar arasinda gezdirir
6)this() icinde bulundugunuz class daki variable'lari
super ise parent class'daki variable'lari cagirmaya yarar
7)Eger data type lari arasinda "is a" or "has a" iliskisi varsa bu data type larina  "covariant" denir
 */

/*
1)Polymorphism==> Coklu sekil
yani bir method'un farkli sekillerde karsimiza cikmasi demek
Polymorphism = Overloading(+) + Overriding(-)
2)Overriding, parent class'daki methodu chil class'in ihtiyaclarina gore ozellestirerek
kullanmak demektir
3)Overriding'de method'un body'si degistirilir
4)Overriding'de method signatura dokunulmaz.Dokunursaniz java kizar
 */

public class Car {
    public void move(){
        System.out.println("Cars move...");
    }
    public void getBrake(){
        System.out.println("Cars break...");
    }
    public void engine(){
        System.out.println("Cars have engine...");
    }
    public String model="Car";
    public int price=0;
    public Car(){
        System.out.println("Car constructor 1");
    }
    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }


}//class
