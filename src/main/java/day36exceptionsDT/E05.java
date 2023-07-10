/*
* throw ile throws keywordleri arasindaki fark nedir?
        1)"throw" method bodysi icinde, "throws" ise method parantezinden hemen sonra kullanilir.
        2) "throw" method bodysi icinde istenilen yerde istenildigi kadar kullanilabilir
        "throws" ise method parantezinden hemen sonra ve sadece 1 kere kullanilabilir.
        3) "throw" dan sonra "new" keyword ve constructor kullanilarak object olusuturulur
        *   "throws" dan sonra sadece Exception Class ismi yazilir
        4) "throw" belli sartlar icin Exception atmada kullanilir
        "throws" ise applicationu Exception attiktan sonra durdurur.
 */
package day36exceptionsDT;

import java.io.FileInputStream;//io ==> input output
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/file.txt");
        int k=0;
        while ((k=fis.read())!=-1){//her characteri ascii ye cevir ve oku, taki -1 esit olmayana kadar
            System.out.print((char) k);//her ascii degerini char'a cevir
        }

    }
}