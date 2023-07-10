package day36exceptionsDT;

public class E03 {
    public static void main(String[] args) {
        Object obj=13;
        try{
            String str=(String) obj;//Exception verecek
            System.out.println(str);
        }catch(ClassCastException e){
            System.err.println("Her data type, her data type'a cevrilmez");
            //System.err.println(); mesaji kirmizi olarak konsola yazdirir ve hata mesaji vermek icin kullanilabilir

        }
        //Birbirine donusturulemeyecek data typ'larini donusturmekte israr edersek Java
        //ClassCastException verir.
    }
}
