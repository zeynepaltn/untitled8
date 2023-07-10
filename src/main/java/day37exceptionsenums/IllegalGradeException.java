package day37exceptionsenums;

public class IllegalGradeException extends Exception{
    /*
    1)Custom Exception Class (kendi olusturdugumuz excp class) olusturmak icin Exception Class'a
    extends etmeliyiz. Exception Class'a extends ederek olsuturdugumuz Custom Exception, compile time
    exception olur.
    2)Custom Exception Class olustururken constructor olusturmaliyiz. Bu constructor parent'daki
    constructor'i cagirmalidir.Bu constructor mesaj verecek veya vermeyecek sekilde olusturulabilir.
    3)Custom exception class olusturdugunuzda ismin sonunda exception kelimesini kullanmalisiniz.
    IllegalGradeException'da oldugu gibi.

     */
    public IllegalGradeException(String message){     //Mesajli Constructor
        super (message);

    }
    public IllegalGradeException(){     //Mesajsiz Constructor
        super ();

    }
}
