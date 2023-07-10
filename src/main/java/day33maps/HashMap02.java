package day33maps;

import java.util.HashMap;
//Java Hashing Tecnic kullanarak herbir "entry" icin "HashCode" uretir ve bu kodu 16'ya boler.
//Bucket'a gider, kalan sayi'nin bulundugu index'e gider ve sirayla "HashCode", "key" ve "value" u koyar.
//Bir bucket'a istediginiz kadar entry koyabilirsiniz
//Java bucket'larin icinde LinkedList kullanir.
//Eger daha once ayni entry ile bir "HashCode" uretildiyse Java tekrar bir "HashCode" uretmez ama "value" degisti ise "overwrite" islemi yapar.
//Java 12 bucket doldugunda yeni 16 adet bucket verir.

public class HashMap02 {
    public static void main(String[] args) {
        //HahMap arkasinda calisan mekanizma nasil calisir?
        HashMap<String,String> capitals=new HashMap<>();
        capitals.put("USA","Washington");
        capitals.put("Italy","Rome");
        capitals.put("Turkey","Ankara");


    }

}
