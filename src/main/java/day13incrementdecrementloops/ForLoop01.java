package day13incrementdecrementloops;

public class ForLoop01 {
    public static void main(String[] args) {
//Example 1:21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tam sayilari ekrana yazdirn
        for(int i=21 ;i<181 ;i++ ){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");

            }

        }
        System.out.println();
    //Example 2:Size verilen kucuk harfle yazilmis indexi cift sayi olan
        // karakterlerini buyuk harfe donduren ve sadece onlari
        // yazdiran kodu yazdirin ankara==>AKR
      //bir string de son index her zaman length()-1 ile yazilir
    String s="ankara";

    for( int i=0;i<s.length();i++ ){
        String ch=s.substring(i,i+1);// tek tek "ankara" daki butun karakterlere gidecek kod
        if(i%2==0){
            System.out.print(ch.toUpperCase());

        }
    }
    }
}
