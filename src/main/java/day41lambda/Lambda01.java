package day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);
        System.out.println(getTheSumOfSquareOfOdds1(nums));
        System.out.println(getTheSumOfSquareOfOdds2(nums));
        System.out.println(getTheSumOfSquareOfOdds3(nums));
        System.out.println(getMultiplicationOfSquareOfEvens(nums));
        System.out.println(getTheSumofEvenMaxAndOddMin(nums));
        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(nums));


    }//main
    //Example 1: Verilen bir list'deki tek sayi olan elemanlarin kareleri toplamini
    // hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums){
        return nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                reduce(0,(t,u)->t+u);
    }
    public static int getTheSumOfSquareOfOdds2(List<Integer> nums){
        return nums.
                stream().
                filter(t->t%2!=0).
                map(Utils::getSquare).//ihtiyacimiz olan method Java class da yoktu Utils class olusturup icine
                //Ihtiyacimiz olan methodu olusturup method reference kullandik
                reduce(0,Math::addExact); //Class ismi::Method ismi==>Method Reference
    }
    public static int getTheSumOfSquareOfOdds3(List<Integer> nums){
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).
                reduce(Math::addExact).
                get(); //Optional <Integer> 'i , integer'a degistirir.
    }

    //Example 2: Verilen bir listdeki cift sayi olan elemanlarin tekrarsiz olarak kareleri
    //carpimini hesaplayan method olsuturunuz
    public static int getMultiplicationOfSquareOfEvens (List<Integer> nums){
        return nums.
                stream().
                filter(t->t%2==0).
                map(t->t*t).distinct().
                reduce(1,(t,u)->t*u);
    }

    //Example 3:Verilen bir listedeki elemanlarin cift sayi olan elemanlarinin max degeri ile tek sayi olanlarin min
    //degerini toplamini hesaplayan methodu yazin
    public static int getTheSumofEvenMaxAndOddMin(List<Integer> nums){
        int maxEven=nums.stream().filter(t->t%2==0).reduce((t,u)->t>u? t:u).get();
        //reduce() dan sonra get() kullanarak optional data tipi probleminden kurtulduk
        int minOdd=nums.stream().filter(t->t%2!=0).reduce((t,u)->t<u? t:u).get();
        return maxEven+minOdd;
    }

    //Example 4: Verilen bir list;deki cift sayi olan leemanlarin 7 den kucuk max degeri ile tek sayi
    // olan elemanlarin 8 den buyuk min degerinin toplamini hesaplayan method'u giriniz.
    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums){
        int max=nums.stream().distinct().filter(t->t%2==0 && t<7).reduce((t,u)->t>u ? t:u).get();
        int min=nums.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t,u)->t<u ? t:u).get();
        return max+ min;
    }





}//class
