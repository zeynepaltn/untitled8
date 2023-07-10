package day28interface;

public interface Animal {
    void eat();

    void drink();

    // 1)interface'lerdeki tum variable'lar otomatik "final" dir
    //bu yuzden interface icerisinde variable olusturdugumuzda mutlaka deger atamasi yapmaliyiz
    //Bilindigi gibi final variable'larin degeri degistirilemez
    // int age; bu sekilde variable initialize yapamayiz hata verir
    // 2) Interface'lerdeki tum variable'lar otomatik olarak "public"dir.
    //3) Interface'deki tum variable'lar otomatik (default) olarak "static" dir.
    int age = 4; // bu sekilde deger atayarak initialize etmeliyiz
}
