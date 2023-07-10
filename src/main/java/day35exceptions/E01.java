package day35exceptions;


        /*+2 yazmamizin sebebi string'i sayiya cevirdi mi diye.
        eger cevirdiyse 125 olacak sonuc, cevirmediyse 1232 concatination yapacak.
        valueOf(str) methodu String'i integer'a cevirir. "123" olan String'i java sayi
         gibi gordu ve istedigimiz
        sekilde toplama islemi yapti. ValueOf nethodunu sayi formatinda olmayan
         bir String ile kullanirsak exception aliriz. NumberFormatException aliriz.
         */


public class E01 {

    public static void main(String[] args) {

        System.out.println(convertStringToInt("123") + 2);
        System.out.println(convertStringToInt("12ab") + 2);

    }

    //Bir String'i Integer'a ceviren method olusturunuz.
    public static int convertStringToInt(String str){

        try{
            return Integer.valueOf(str);
        }catch(NumberFormatException e){//NumberFormatException valueOf() method'u non-digit character iceren bir String ile kullanildiginda atilir.
            str = str.replaceAll("[^0-9]", "");
            return Integer.valueOf(str);
        }
    }

}
