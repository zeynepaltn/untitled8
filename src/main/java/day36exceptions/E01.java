package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    /*
    1)Run button'una bastiktan sonra konsolda alinan exception'lara "run time exception" denir
    Aritmetic Excp, NullPointerExcp, NumberFormatExcp, ArrayIndexOutOfBoundsExcp,StringIndexOutOfBoundExc,
    "RunTime Exception" lara ornektir. RunTime Excp'lara "Unchecked Exception" da denir.

    2)Code yazarken kirmizi alt cizgi seklinde alinan exception'lara "Compile Time Exception" denir
    FileNotFoundException ve IOException "Compile Time Exception" a ornektir.
    CompTime Excp'lara "Checked Exception" da denir

    3)FileNotFoundException:Java'ya bir dosyayi bul dedigimizde, Java "Dosyanin adresi" ve "dosyanin varligi"
    konusunda hata olursa ne yapmasi gerektigini soyleminizi ister.

    4)IO Exception:"IO" input output demektir.
                        Note:IOException, FileNotFoundException'in parent'idir.

    5)Java'da hatalar temelde ikiye ayrilirlar, birincisi Exception'lar digeri ise Error'lar.
    Exception'lar handle edilebilir, fakat error'lar asla handle edilemezler.
    Error:
    a)StackOverFlow error, b)Out of Memory (heap memory) c)Virtual Machine Error(Java'nın icindeki sanal makine arızası)

     */
    public static void main(String[] args) throws IOException {
        //1.Way
        FileInputStream fis=new FileInputStream("src/main/java/day36exceptions/TextFile");//Java'ya bu adresdeki file'i bul dedik
        int i=0;
        while((i=fis.read())!=-1){ //karakterleri tek tek okuyacak ama karakterleri degil ascii degerleri alir

            System.out.print((char)i); //Ascii degeri karaktere cevirdi

        }


    }
}
/*
Zeynep Hanim Notlar
Compile Time Exception:

1)FileNotFoundException(Dosya bulunamadi hatasi)
Javadan bir dosyayi bulmasini istediginizde java dosyanin adresi ve dosyanin varligi konusunda hata olusursa
ne yapmasi gerektigini de soylemenizi ister.
Ona ne yapmasini soylersek ayrica javayi bu dosyanin silinmedigi konusunda rahatlatmamiz gerekir.

2)IOException(Input-Output)
Bu exception input ve output ile ilgili tum problemleri handle edebilir. Application'imiza data girdisi yaptigimizda veya data ciktisi yapabiliriz.
Dosyanin bulunmasi halinde oradaki datayi kullanabiliriz. Oyleyse dosyanin bulunmasi input ile alakali bir operasyondur. IOException bu nedenle
FileNotFoundException'in parent'idir. Genel olan spesifik olanin parent'i olur. Bu durumda parent catch block'da ona gore sirasini alir.
Coklu catch block yapmazsak, o zaman sadece IOExeption'i kullaniriz.
 */
