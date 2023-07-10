package day25polymorphism;

public class Animal {
    /*
    1)Parent'taki method ile Child'da Overrida edilen method'un access modifier'i ayni olabilir
    2)Child'da Overrida edilen method'un access modifier'i Parent'taki method'un access modifier'dan dar olamaz
    3)Parent'taki method'un access modifier'i Child'da Overrida edilen method'un access modifier'indan dar olabilir
    4) Method' un return type' i "primitive" ise Overrriding yapildiginda return type degistirilemez.
    5)  Method' un return type' i "void" ise Overrriding yapildiginda return type degistirilemez.
    6)Dondurdugumuz sey ile return type arasinda IS-A iliskisi varsa return type degistirilebilir.
     Aksi takdirde degistirilemez.Mesela; Integer Wrapper Class ile Long Wrapper Class arasinda "IS-A"iliskisi yoktur, o yuzden
     return type Integer oldugunda Long'a degistirilemez, return type ayni olmak zorundadir
    7)Return type wrapper class oldugunda overriding yaparken, return type degistirilemez.
    8)"final method"lar Override edilemezler.
    "final method"larin body'si degistirilemez ama Override ederken method body'i degistiririz bu bir celiskdir.
     Bu yuzden Java "final method"larin Override edilmesine musaade etmez.
     (Final variable olusturdugumuzda mutlaka deger atamak zorundayiz ex; pi=3.14,final method yapmak icin de
     AM'den sonra "final" keyword'unu koymamiz lazim). Class final ise o class'in cocugu olamaz.
    9) "Static method'lar override edilemezler". Cunku static methodlar tum childlar icin ortak methodlardir.
    Bir child ortak methodu egistirdiginde diger child lar bundan etkilenir. Bu etkilenme ummadik sonuclar
    ortaya cikarabilir. Bu yuzden java, static methodlarin override edilmesine musade etmez.
    10)Method'un return typ'i void ise overriding yaparken return type degistirilemez.
 */
    public void move(){
        System.out.println("Animals move...");
    }
    public int add(int a,int b){
        return a+b;
    }
    public Animal create(){
        return new Animal();
    }
    public Integer multiply(Integer a, Integer b){
        return a*b;
    }
    public final double circleArea(double r){
        return 3.14*r*r;
    }
}//class
