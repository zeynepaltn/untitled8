package day22stringbuilder;

public class Sbf01 {
    public static void main(String[] args) {
        /*
        1)Stringbuffer Java da String ureten bir class'dir.
        2)Stringbuffer, StringBuilder a cok benzer, ikisi de mutable dir.
        3)StringBuffer "multi-thread (coklu is)" dir ama StringBuilder degildir
        4)java StringBuffer'i, StringBuilder'den once yapti
        5)StringBuilder multi=thread olmadigi icin StringBuffer dan daha hizli calisir
        6)Multi-thread yapilirken yapilan islerin siralaamsi onem arzeder. Yapilan isleri
        mantikli bir siraya koymak "synchronization" olarak adlandirilir
        StringBuffer multi-thread" oldugu icin ayni zamanda "synchronized"
dir.        3 tane String olusturan class ogrendik;
        1)immutable string lazima;String class
        2) mutable string lazimsa;StringBuilder veya StringBuffer
                                  i)StringBuilder'i multi-thread gerekmezse
                                  ii)StringBuffer'i multi-thread gerekirse kullaniriz

         */
        StringBuffer sbf1=new StringBuffer();

    }//main
}//class
