package day34exceptions;

public class E03 {
    public static void main(String[] args) {
 // Bir string'deki karakter sayisini veren method olusturunuz.

        System.out.println(getNumOfChars("Java"));
        System.out.println(getNumOfChars("Money"));
        System.out.println(getNumOfChars(""));
        System.out.println(getNumOfChars(null)); //Exception :Cannot invoke "String.length()" because "s" is nul
        // String'in degeri "null" oldugunda String Class'daki bazi methodlari kullanamayiz. Kullanirsaniz Java "NullPointerException" atar


    }//main
    public static int getNumOfChars(String s){
        int result=0;
       try{
           result=s.length();

       }catch(NullPointerException e){
           System.out.println(e.getMessage());//bu sekilde java kendi teknik mesajini yazdirir

        }
       return result;
    }


}
