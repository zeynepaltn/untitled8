package day35exceptionsDT;
/*
Exception beklenmedik problem demektir. JAva beklenmedik bir sorunla karsilastiginda Exception class'i devreye girer.
Exception Class'i bize karsilasilan sorunun cinsini,bu sorunun nereden kaynaklandigini ve sebebini verir.
****Java exception firlattiginda kodun calismasini durdurur (stops execution). Java exception olusturan kod icin bizden
bir karar vermemizi ister.
****Eger hicbir sey yapmaz isek beklendigi gibi kodumuzun calismasini durdurur
*Kodumuzun calismaya devam etmesini istiyorsak try-catch ile exception olusturmasi muhtemel
kodlarimizi catch blogu icinde yazmaliyiz.Exception'a uygun cozumler uretmeye exception handling denir.
Exception olustugunda bunu ilan edip geri cekiliriz, buna throw exception denir.
Exception'a uygun cozumler uretmede "try-catch" kullanilir, try block icinde yapilmasi gereken islemi Java'dan isteriz
Eger java bu islemi sorunsuz bir sekilde yaparsa catch-block devreye girmez.
try block icerisinde eger bir exception olusursa catch block o zaman devreye girer, catch block icindeki
kodlar calisir ve try block icinde islem yapilirken "exception" olusursa try block icindeki exception'dan sonraki
kodlar calistirilmaz.
Catch satirindaki parantez icine karsilasilmasi muhtemel olan exception class ismini ve bir object ismi (e) yazariz.
 */

public class E01 {
    public static void main(String[] args) {
        divide(12,6);
        divide(12,0);
        divide2(6,0);

    }//main
//******1.Way******\\
    public static void divide(int a, int b){
        if(b==0){
            System.out.println("Sayi sifira bolunemez");

        }else{
            System.out.println(a/b);
            System.out.println("divide methodu ici");//exception'da java nin durdugunu gostermek icin kullanacagiz bu kodu

        }

    }
    public static void divide2(int a, int b){
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Sayi sifira bolunemez");
        }
        System.out.println("try catch ile handle edildi");

    }
}
