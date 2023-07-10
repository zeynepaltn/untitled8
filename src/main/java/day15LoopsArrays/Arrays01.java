package day15LoopsArrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1) Arrays Java nin coklu data depolamak icin olusturdugu bir yapidir
        2) Arrays icerisine farkli data type lari koyamayiz (ayni data tipi olmali)
        3) Array ler pimitive data type larla veya "referanslarla "calisir
        4)Array ler cok hizlidir ve memory de az yer kaplarlar bu sebepten non primitive data kullanmazlar

         */
        String stNames[]=new String[5];// bu sekilde olusturulur
        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stNames));// cvp null olacak string in default degeri
        //Array e nasil eleman eklenir
        //Array lerde String gibi index kullanir
        stNames[0]="Altun";
        stNames[1]="Zeynep";
        stNames[2]="Rukiye";
        stNames[3]="Neva";
        stNames[4]="Isa";
        System.out.println(Arrays.toString(stNames));
        // Array deki specific bir elemani nasil alabiliriz
        System.out.println(stNames[3]);//neva cunku indexe 3 yazdim ve Neva nin indeksi 3
    //Example 1: stNames array indeki her ismin sonuna yildiz koyarak konsola yazdiriniz
        //1. yol
    for(int i=0;i< stNames.length;i++){ //length Stringlerde parantezli, Array lerde parantezsiz kullanilir
        System.out.println(stNames[i]+"*");

    }
    // 2. yol
    //**************For-each loop (enhanced loop)***************\\
        for(String w:stNames){ //String w:stNames burada variable atadik
            System.out.println(w+"*");
        }
    //Example 2: Bir integer array olusturun 5 eleman ekleyin
        // elemanlarin toplamini bulup konsola yazdiriniz
        int ages[]=new int[5];
        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0]
        ages[0]=12;
        ages[1]=23;
        ages[2]=9;
        ages[3]=38;
        ages[4]=27;
        int sum=0;
        for(int w: ages){
            sum=sum+w;
        }
        System.out.println(sum);
        //Example3: initial lardan Bir char array i olusturun 3 eleman ekleyin elemanlarin carpimini bulup konsola yazdirin
        char ch[]=new char[3];

        ch[0]='J';
        ch[1]='P';
        ch[2]='A';
        int multip=1; //carpacagimiz icin yutmasin diye elemanlari 0 ile baslamadik
        for(char w:ch){
           multip=multip*w;


        }
        System.out.println(multip);
    }
}
