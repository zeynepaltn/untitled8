package day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
        /*
Bie array in elemanlari da array olursa multi dimensional denir
 */
     String names[][]=new String[3][2];
     names[1][0]="P";
     names[2][1]="Z";
     names[0][0]="A";
     names[0][1]="K";
     names[1][1]="M";
     names[2][0]="C";
     //Multi-dimensional array leri konsola yazdirmak icin to string degil, deepToString methodu kullanilmali
        System.out.println(Arrays.deepToString(names));
     //Multi-dimensional array icinden specific bir eleman nasil yazdirilir
        System.out.println(names[1][1]); //M
     //Multi dimensional array icerisinden bir array i yazdirmak
        System.out.println(Arrays.toString(names[0]));  //[A,K]
        System.out.println(Arrays.toString(names[1])); //[P,M]
       //Kisa yoldan multi dimen array nasil olusturulur
       String students[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
       //Kisa method u kullanirken ic array lerin eleman sayisi esit olmak zorunda degil
     //Example 1: Yukaridaki student array iin de toplam kac isim oldugunu bulunuz
     int sum=0;
     for(String[] w:students){
         sum=sum+w.length;

     }
        System.out.println(sum);
     //Example 2: Yukaridaki student array inde icinde "m" olan isimleri konsola yazdiriniz

     for(String[] w:students) {
         for (String k : w) {
             if (k.contains("m")) {
                 System.out.println(k);
             }
         }
     }
     //Example 3: Integer multi dim array olusturun, tum elemanlarin carpimini hesaplayin
     int nums[][]={{5,4},{2,3,2},{7}};
         int multp=1;
         for(int[] t:nums){

             for(int a:t){
                 multp=multp*a;

             }
         }
        System.out.println(multp);
     //Example 4: Iki boyutlu bir array i tek boyutlu bir array e ceviriniz
        int numbers[][]={{5,4},{2,3,2},{7}};  // buna cevir==>{5,4,2,3,2,7}

        //Iki boyutlu array de kac eleman oldugunu bulan kodu yazmaliyiz once
        int toplamElemanSayisi=0;
     for(int [] w:numbers){
         toplamElemanSayisi=toplamElemanSayisi+w.length;

     }

     //Tek boyutlu arrayi iki boyutlu array in eleman syisini kullanarak olusturmaliyiz
     int newArr[]=new int[toplamElemanSayisi];

     //iki dimensional array deki elemanlari tek dimens array e transfer etmeliyiz
        int idx=0;
        for(int[] w:numbers){
            for(int k:w){
                newArr[idx]=k;
                idx++;

            }
        }
        System.out.println(Arrays.toString(newArr));
     //Multi dim array daki en kucuk ve en buyuk elemanin toplamini bulunuz
        int ages[][]={{15,4},{12,43,21}};
     //tek boyutlu elemana cevirip, siralayip (ascending order), en buyuk ve kucugu toplayabiliriz ama uzun surer
     int small=ages[0][0]; //multi dim array de en kucugu assume ediyorum
     for(int[] w:ages){
         for(int k:w){
             small=Math.min(small,k);

         }

     }


    }

}
