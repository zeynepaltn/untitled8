package day35exceptions;

public class E02 {
    //Bir string'deki char'i index olarak alan bir method olusturunuz
    public static void main(String[] args) {
        System.out.println(getCharFromString("Java", 2));
        System.out.println(getCharFromString("Java", 8));//Exception verecek, index 8 yok

    }
    public static char getCharFromString(String str,int idx){
        try {

            return str.charAt(idx);
        }catch(StringIndexOutOfBoundsException e){
            idx=Math.abs(idx);
            idx=idx%str.length();//index buyuk oldugunda length den kucuk hale getirmek icin bunu yaptik
             return str.charAt(idx);
        }
    }
}
