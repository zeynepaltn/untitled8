package day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    /*
    1) Ayni data tipindeki coklu datalari depolamak icin Aray kullaniriz
    2) Array lerin bir negatif yonu var, icine koyacaginiz eleman sayisini
    en basta belirlemek zorundasiniz, ileride degisiklik yapmak zor olur
    3) Array ler eleman sayisinda esnek degildirler bu yuzden Java, Array List adli
    yeni bir yapi olusturdu ve bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini
    sifir olarak ayarlar. 1000 eleman koyarsaniz eleman sayisini 1000 olarak ayarlar.
    4)Array List yerine sadece List de diyebiliriz.
    5)Java Array List leri olusturunca Array leri iptal etmiyor, cunku Array ler super hizlidir
    Arrey ler memory de cok az yer kaplar
    6)Array ler, primitive data types ve referanslari az yer kaplar. (stack memory de saklanir)
    Array List ler non-prim data typlari depolar bu yuzden cok yer kaplar.
     */
    public static void main(String[] args) {
        //Array List nasil olusturulur?
        ArrayList<Integer>ages=new ArrayList<>();
        //Array List konsola nasil yazdirilir?
        System.out.println(ages);// []
        //Array List'e eleman nasil eklenir?
        //*****1. Yol*****\\
        ages.add(12);
        ages.add(24);
        ages.add(9);//add methodu elemanlari giris sirasina (insertion order) gore list e yerlestirir
        System.out.println(ages);// [12,24]
        //*****2. Yol******\\
        ages.add(1,99);
        System.out.println(ages);//[12,99,24,9] 1. Index e 99 yerlstirdim
        ArrayList<Integer>price=new ArrayList<>();
        price.add(23);
        price.add(33);
        //***3. Yol***\\
        ages.addAll(price);// Bir list i diger list in icine yerlestirir.
        System.out.println(ages);//[12,99,24,9,23,33]
        //*4. Yol*\\
        ages.addAll(3,price);
        System.out.println(ages);//[12,19,24,23,33,9,23,33]
        //Array List'te eleman sayisi nasil bulunur?
        int numOfElement=ages.size();
        System.out.println(numOfElement); // 8 eleman var
        //Array de specific eleman nasil alinir?
        int el1=ages.get(3);// istedigim index deki elemni almami saglar get methodu
        System.out.println(el1);//23
        //Array List de var olan specific bir elemani nasil degistiririz?
        ages.set(6,111); //6. index dekini 111 ile degistir demek
        System.out.println(ages); //[12, 99, 24, 23, 33, 9, 111, 33]
        //Arrays List de specific bir eleman var mi yok mu nasil buluruz?
        boolean r1=ages.contains(99); // var mi yok mu kontrolu yaptigim icin ya true ya da false diyecek o yuzden boolean
        System.out.println(r1); //true
        // liste bos mu dolu mu nasil bakariz?
        boolean r2=ages.isEmpty();
        System.out.println(r2);//false
        //Bir Array List deki tum elemanlari nasil sileriz?
        ages.clear();
        System.out.println(ages);// []
        //Bir List in bos olup olmadigini kontrol eden kodu yaziniz
        // 1. METHOD
        ArrayList<String>names=new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");
        if(names.size()==0){
            System.out.println("list bostur");
        }else{
            System.out.println("list de en az bir eleman vardir");
        }
        //2. METHOD
        if(names.isEmpty()){ // bu method daha kisa ve kolay daha kullanisli
            System.out.println("list bostur");
        }else{
            System.out.println("list de en az bir eleman vardir");
        }

    }//main
}//class
