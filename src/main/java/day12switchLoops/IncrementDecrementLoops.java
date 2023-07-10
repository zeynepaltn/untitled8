package day12switchLoops;

public class IncrementDecrementLoops {
    public static void main(String[] args) {
      /*
      **********TOPLAMA*************
      1) int age=12;                                 2) age+=1 same as 1)
         age=age+1; veya 1'den farkli bir sayi       3) age++ sadece 1 artirrmak icin kullanilir
         Aynisini cikarma carpma ve bolme islemleri icin yapabiliriz
        Increment toplama ve carpma, decrement cikarma ve bolme ile yapilir
        Inc and Dec 3 farkli yolla yapilir 1)int i=15;===> i=i+5;
                                           2)int i=12;==>i+=5;
                                           3)int i=12;==>i++  Bu methodla sadece 1 arttirabilirz
       */
        int age=12;
        System.out.println(age);
        age++; //int kutusuna koymadan yaziyoruz koyarsak eger arttirmaz
        System.out.println(age);
        age=++age; //java yukaridan asagi soldan saga calisir o yuzden ++ once yazdik
        //age++ post inc ++age pre incr
        System.out.println(age);
        int salary=40;
        salary=--salary;//39 verir ama salary-- seklinde yazsaydik 40 verirdi
        System.out.println(salary);
    }
}
