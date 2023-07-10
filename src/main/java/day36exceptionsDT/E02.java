package day36exceptionsDT;

public class E02 {
    public static void main(String[] args) {

        String s="Java";
        getNumberOfChars(s);
        String t="";
        getNumberOfChars(t);
        String u=null; //burada exception aliriz, null hiclik demek yani yok
        //hiclikte,yoklukta karakter sayisi arayamayiz.
        getNumberOfChars(u);
    }//main
    //String'in degeri null oldugunda string class daki bazi methodlari kullanmya
    //calisirsaniz java "NullPointerException" gonderir
    public static void getNumberOfChars(String s){
        try{
            int numOfChars=s.length();
            System.out.println(numOfChars);
        }catch(NullPointerException e){
            System.out.println("Null degeri icin bazi methodlar kullanilamaz");
        }


    }
}
