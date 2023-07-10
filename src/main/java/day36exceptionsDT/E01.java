package day36exceptionsDT;

public class E01 {
    /*
       *try kisminda birden fazla exception olusturma ihtimali olan kodlar varsa coklu catch kullanabilirsiniz.
       *Coklu catch kullandiginizda exception class'lar arasinda parent child iliskisi yoksa, catch'lerin sirasi
       onemli degildir. Ama koddaki siralamaya uymak tavsiye edilir.
       * *Coklu catch kullandiginizda exception class'lar arasinda parent child iliskisi varsa, catch'lerin sirasina
        dikkat etmliyiz, child class ustte olmalidir.
       *Exception class'lar arasinda parent-child iliskisi varsa
            ==>Ya child classi uste yazarak child ve parent icin ozellestirilmis kodlar yazarsiniz
            ==>ya da child'i hic kullanmaz sadece parent ile exception'lari halletmeye calisiriz.

     */
    public static void main(String[] args) {
        int a=12;
        int b=4;
        String s="My Java";
        getCharFromString(s,a,b);
    }//main
    public static void getCharFromString(String s,int a,int b){
       try{
           int idx=a/b;

           char ch=s.charAt(idx);
           System.out.println(ch);
       }catch(ArithmeticException e){
           System.out.println("Do not divide by zero");
        }catch(StringIndexOutOfBoundsException e){
           System.out.println("Olmayan index kullandiniz");

       }

    }

}
