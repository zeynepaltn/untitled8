package day34exceptions;
/*
1)Exception, beklenmedik problemlere kod dunyasinda verilen isimdir.
2)Exception'lari halledebilmek icin iki temel yol varddir;
    i)Exception'a uygun cozumler uretmek, buna "Exception Handling" denir.
    ii)Exception olustugunda bunu ilan eder ve geri cekilirsiniz.Buna'da "Throw Exception" denir.
3)"Exception" a uygun cozumler uretmede "try-catch" kullanilir.
  "try block" da yapilmasi gerekenislemi Java'dan yapmasi istenir.
  Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
  "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer
  ve "catch block" icindeki kodlar calisir.
4)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan
 sonraki kodlar calistirilmaz.

 */

public class E01 {
    //Exception Class'lar application'in hatasiz olarak calismasi icindir
    //Exception handle edilmezse sonra gelen kodlar calismaz Java kilitler

    public static void main(String[] args) {
        System.out.println(divide1(12, 3));//4
        System.out.println(divide1(6, 0));//burda bize ArithmeticException verecek, / by zero yazarak s
                                                //bize hatanin bu oldugunu soyluyor
        System.out.println(divide2(5, 0));//Do not divide any number by 0

    }//main
    //1. Way:Exception'i handle etmede ilk yol, ama bu method meseleyi tamamen cozmedi
    //9-1-1 gibi her ihtiyaca her aksilige cevap verebilek bir sisteme ihtiyac var. Bknz 2. Way.
    public static int divide1(int a, int b){
        if(b==0){ //bunu exception 'i gidermek icin yazdik
            return 0;
        }else {
            return a / b;
        }

    }
    //2.way:Exception'i handle etmede harika bir yol
    public static int divide2(int a, int b){
        int result=0;
        try{
            result=a/b;
        }catch(ArithmeticException e){
            // "ArtihmeticException" matematik ile ilgili herhangi bir kural ihlali yapildiginda atilir.
            System.out.println("There is and issue with division");
        }
        return result;
    }
}
