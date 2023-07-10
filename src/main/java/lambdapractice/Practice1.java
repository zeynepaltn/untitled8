package lambdapractice;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
        public static void main(String[] args) {

            List<Integer> nums = new ArrayList<>();
            nums.add(12);
            nums.add(9);
            nums.add(131);
            nums.add(14);
            nums.add(9);
            nums.add(10);
            nums.add(4);
            nums.add(12);
            nums.add(15);

            elemanlariYazdir(nums);
            System.out.println();

            elemanlariYazdir2(nums);
            System.out.println();

            ciftElYazdir(nums);
            System.out.println();

            ciftElYazdir2(nums);
            System.out.println();

            tekElKareYazdir(nums);
            System.out.println();

            tekElKupleriniTekrarsizYazdir(nums);
            System.out.println();

            System.out.println(benzersiCiftSayilarinKareleriTop(nums));
            System.out.println();

            benzersizCiftElKareCarpimiYazdir(nums);
            System.out.println();

            listedenMaxYazdir1(nums);
            System.out.println();

            listedenMaxYazdir2(nums);
            System.out.println();


        }

        //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

        public static void elemanlariYazdir(List<Integer> nums){ //12 9 131 14 9 10 4 12 15
            for (Integer w : nums){
                System.out.print(w+ " ");
            }
        }

        //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

        public static void elemanlariYazdir2(List<Integer> nums){ //12 9 131 14 9 10 4 12 15
            nums.stream().forEach(t-> System.out.print(t+ " "));
        }

        //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

        public static void ciftElYazdir(List<Integer> nums){ //12 14 10 4 12
            for (Integer w : nums){
                if (w%2 == 0){
                    System.out.print(w + " ");
                }
            }
        }

        //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

        public static void ciftElYazdir2(List<Integer> nums){ //12 14 10 4 12
            nums.
                    stream().
                    filter(t->t%2==0).
                    forEach(t-> System.out.print(t+" "));
        }

        //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

        public static void tekElKareYazdir(List<Integer> nums){ //81 17161 81 225
            nums.
                    stream().
                    filter(t->t%2!=0).
                    map(t->t*t).
                    forEach(t-> System.out.print(t+" "));
        }


        //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

        public static void tekElKupleriniTekrarsizYazdir(List<Integer> nums) { //729 2248091 3375
            nums.
                    stream().
                    distinct().
                    filter(t->t%2!=0).
                    map(t->t*t*t).
                    forEach(t-> System.out.print(t+" "));
        }

        //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz

        public static int benzersiCiftSayilarinKareleriTop (List<Integer> nums) { //456

            return nums.
                    stream().
                    distinct().filter(t -> t % 2 == 0).
                    map(t -> t * t).
                    reduce(Math::addExact). //coklu datayi tek dataya indirmek
                            get();
        }

        //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz

        public static void benzersizCiftElKareCarpimiYazdir(List<Integer> nums) {
            Integer benzersizCiftKareCarpim = nums.
                    stream().
                    distinct().
                    filter(t->t%2 ==0).
                    map(t->t*t).
                    reduce(Math::multiplyExact).
                    get();//45158400

            System.out.println(benzersizCiftKareCarpim);
        }

        //9)Liste ogelerinden max degeri veren bir method olusturunuz

        public static void listedenMaxYazdir1(List<Integer> nums){

            //1. Yol
            Integer max = nums.
                    stream().
                    distinct().
                    reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u); //ilk basta -2 milyardan akistaki ilk sayi kucuk mu diye soruyor
            System.out.println(max);

            /*
                1. Yol:
            Maximum degeri bulabilmek icin coklu datayi tekli dataya dusurmeliyiz. Cunku birden fazla ayni sayilar olabilir.
            reduce metodu icinde Integer Classini yazarak bu Class'daki metodlari kullandik. Uygun olan MIN_VALUE olup devaminda
            parantez icine iki sayi verdik. Bu sayilari t ve u harfleri temsil edecek sekilde yazdik. ve devaminda ternary
            yapisi ile sayilardan t u'dan buyukse diye sorduk. Kodumuzu max isimli Integer bir conteynerine assign ettik.

            int Max=nums.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->>u ? t: u);

            stream metodu ile elamanlari stream'e cevirdik ve hepsi alt alta yazildi. reduce metodu ile elemanlari indirge dedik.
            reduce metodu icinde Integer.MIN_VALUE baslangic deger demektir. t her zaman ilk degerini baslangic degeri
            dedigimiz Integer.MIN_VALUE'yi alir,  Integer.MIN_VALUE degeri -2 milyar. Bu sabit bir deger. u ise stream icinde siralanan bastaki degeri alir. t daha sonra stream'deki
            ikinci degeri alir.  Sirasiyla t>u kisminda iki sayi deger aldikca karsilastirilir.
            Basta -2 milyar>12  12 daha buyuk. Bu sekilde biz buyuk olani bulduk.
             */
        }

        //2. Yol

        public static void listedenMaxYazdir2(List<Integer> nums){
            Integer max2 = nums.
                    stream().
                    distinct().
                    sorted().
                    reduce((t,u)->u).get(); //ben sana iki sayi vereyim sen bana 2. sayiyi dondur
            System.out.println(max2);

            /*
            2.YOL
            1.Yoldan farki sorted metodu ve reduce metodunu kullandik. reduce metodu icine (t,u)->u).get() metodunu kullandik.
            get metodu ile bu sekilde yazdirinca goremeyecegimiz icin atama yapmamiz gerekti. kodumuzu max2 isimli
            Integer conteynerina assign ettik. 2. Yol tercih edilir. Cunku daha az metod kullanildi.
             */
        }

        //3. Yol

        public static void listedenMaxYazdir3(List<Integer> nums){
            Integer max3 = nums.
                    stream().
                    distinct().
                    reduce(nums.get(0), (t,u) -> t>u ? t : u ); //numstan akistaki ilk elemani getir

            /*
            3.YOL(Son yaptigimiz)/2.yol olarak yazdik.
             burada sorted metodu kullanmadik. distinct ve reduce metodlarini yine kullandik. reduce metodu icinde nums.get(0)
             nums'in ilk indexteki elemanini, degeri aldi dedik. nums.get(0), (t,u)->t>u ? t :u ); get(0) ile ilk degerimiz 0.nci indexteki deger olacak.
             Iki onceki yolda baslangic degerimiz Integer.MIN_VALUE idi. Simdi t baslangictaki
             deger olarak 0.nci indexteki degeri alir. Listimizde ilk eleman 12 idi. U ise ikinci indexteki elemani alacak.
             Listimiz icinde 2. index 9. Burada 12 9'dan buyuk mu diye bakacagiz. Buyuk oldugu icin true olacak ve sirasiyla bu sekilde devam edecek.
             Boylece en buyuk sayi elimizde kalacak ve sonucta gorebiliriz.
             */


        }

        //10)Liste ogelerinden minumum degeri veren method olusturunuz

        public static void listMinEleman(List<Integer>nums){
            Integer min =nums.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
            System.out.println("min = " + min);
        }

}
