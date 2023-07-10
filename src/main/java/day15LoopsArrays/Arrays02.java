package day15LoopsArrays;

import java.util.Arrays;

public class Arrays02 {
    /*
    1)Application larda "data" ile bu data lari isleyen kodlar birbirinden ayrilir
    yani logic data ya bagimli olmamalidir
    data ya bagimli yailan kodlara hard code denir
    "hard code" hatali kod demektir
    Asagidaki grade array inde son elemani almak icin 4 veya grade.length-1 kullanilabilir ama 4
    kullanirsaniz array a yeni eleamn eklendiginde kod yanlis sonuc verir
     */
    public static void main(String[] args) {
       //Kisa yoldan nasil array olusturabilirz
       int grade[]={67,98,100,34,76};
        System.out.println(Arrays.toString(grade));
    //grades array indeki en kucuk ve en buyuk grade in toplamini ekrana yazdirin
     Arrays.sort(grade); //kucukten buyuge siralar
        System.out.println(Arrays.toString(grade));
        System.out.println(grade[0]+grade[grade.length-1]);//length-1==> son elemani verir


        //Size verilen bir string array deki isimlerden 5 karakterden az olanlari ekrana girin
        String stNames[]=new String[5];
        stNames[0]="Ayda";
        stNames[1]="Ayhan";
        stNames[2]="Cuneyt";
        stNames[3]="Filiz";
        stNames[4]="Tom";
        //System.out.println(Arrays.toString(stNames)); bu kod isimleri yazdirir
        for(String w:stNames){
            if(w.length()<5){
                System.out.println(w);
            }

        }
     ////Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isimlerden onceki isimleri console'a yazdiriniz
     Arrays.sort(stNames);
        for(String w:stNames){
            if(w.startsWith("F")){
                break;
            }
            System.out.println(w);

     }
        ////Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isimlerden onceki isimleri ve "F" ile baslayanlari console'a yazdiriniz
        Arrays.sort(stNames);

        for(String w : stNames){
            System.out.println(w); //sout i hemen for loop undan sonra yazarsak bu sefer filizi de yazdirir
            //cunku f ye gelene kadar her ismi yazdiracak ama f den sonra loop kirilicagi icin geri kalanlar yazilmayacak
            if(w.startsWith("F")){
                break;// f ile baslayan bir seye denk gelirse loop kirilsin
            }
        }

        ////Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        // isimler haric diger isimleri console'a yazdiriniz
        Arrays.sort(stNames);
        for(String w:stNames){
            if(w.startsWith("F")){
                continue;//bazi specific datalari ise sokmak istemiyorsak onlari dislamak istiyorsak
                         //continie kullaniriz

            }else{
                System.out.println(w);
            }
        }
        //sort methodu numeric data lari kuckten buyuge
        //string leri ise alfabetic order (natural order) ile dizer
    }
}
