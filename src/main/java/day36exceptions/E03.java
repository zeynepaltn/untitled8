package day36exceptions;

public class E03 {
    /*
    Throws ile Throw arasindaki farklar nelerdir?
    1)"Throws" method signature satirinda kullanilir. "throw" ise method body icerisinide
    kullanilir.
    2)"Throws" method signature satirinda bir veya birden fazla "exception" ile, bir kere kullanilir.
    "Throw" ise method body icerisinde bir tane "exception" ile tekrar tekrar kullanilabilir.
    3)Throws'dan sonra sadece exception class isimleri yazilir, "throw" dan sonra ise
    exception class'dan object olusturulur
     */
    public static void main(String[] args) {
        printAge(23);
        try{
            printAge(-12);
        }catch(IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }
        
    }
    //Example 1: Kullanicidan alinan yasi konsola yazdiran method olusturunuz
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Used negative integers for ages");//kendimiz exception olusturuyoruz

        }
        System.out.println(age);
    }
}
