package day18constructorsstatickeyword;

public class MethodOverLoading {//ayni isimde farkli isler yapan methodlar olusturmaya denir
    //her parametreye gore yeni method olusturmamak icin var
    //application nin structure ini guzellestirmek icin method overloading yapapriz

    /*
    1) bir method ayni isim ve farkli parametrelerle olusturulursa buna "Method Overloading" denir.
    2) "Method Overloading" javada "iyi organizasyon" icin onemlidir.
    3) Method Overloading yapilirken parametre 3 sekilde degistirilebilir.
       i.   parametrelerin sayilari degistirilebilir.
       ii.  parametrelerin data type'larini degistirebilirsiniz
       iii. parametrelerin data type'lari farkli ise yerleri degistirilebilir.
    4) Method overloading "bir" class in icinde olusur bu yuzden private method larda
    overload edilebilir (INTERVIEW SORUSU OLABILIR)
    method overloading butun access modifier ile kullanilabilir
    5) Static method lar overload edilebilirler
     */
    public static void main(String[] args){
        System.out.println(add(3,5));
    }

    public static int add(int a, int b){

        return a+b;
    }

    public static int add(int a, int b, int c){

        return a+b+c;
    }

    public static double add(double a, int b){

        return a+b;
    }

    public static double add(int a, double b){

        return a+b;
    }



}