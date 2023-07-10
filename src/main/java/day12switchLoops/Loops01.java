package day12switchLoops;

public class Loops01 {
    public static void main(String[] args) {
       //Ekrana 5 kere "Hi" yazdirin
       // 1. Method
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        //fakat bu standardlara uygun bir kod yazma sekli degildir
        //tekrarlar hos karsilanmaz, kodlar dinamik olmali ve kolay fix yapilmalidir
      //2. Method burada loop lar kullanacgiz tekrar gerektiren yazilimlar icin
      // 4 tane loop var 1) for loop 2) while loop 3) do-while loop 4)foe-each loop
        //*****************FOR LOOP*****************\\
        /*
        for(BASLANGIC DEGERI ;CALISMA SARTI ;ARTTIRMA YA DA EKSILTME )
         {CAISMASINI ISTEDIGIMIZ KOD}====> structure
         */
        for(int i=1;i<6;i++){
            System.out.println("Hi");

        }
        //exmaple 2: 11 den 14 e kadar olan sayilari ekrana yazdirin
        for(int a=11;a<15;a++){
            System.out.println(a);

        }
        //example 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz
        for(int i=40;i>22;i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // example 4: 18 den 56 ya kadar olan tum tek sayilari yazdirin
        for(int b=18;b<57;b++){
            if(b%2!=0) {
                System.out.print(b+ " ");


            }
        }
        //Massachusetts kelimesindeki tum sesli harfleri konsola yazdiriniz
        String s="Massachusetts";
        for(int i=0;i<s.length();i++){      //s.length() bu stringdeki karakter sayisini verir
         char c=s.charAt(i);
         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
             System.out.println(c+" ");

         }
        }
        }

    }

