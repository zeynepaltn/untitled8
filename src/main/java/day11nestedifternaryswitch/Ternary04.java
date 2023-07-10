package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {
        /*
        kullanicidan aldigininz sayi cift ise 2 ye bolumunu, degilse
        bu sayi ikiye bolunmez yazan kodu girin
         */
        /*
        ternary de true ve false durumlarinda size verilen data tipleri farli ise
        olusturdugunuz konetynirin data tipini object yapin
        object java da bir class dir
        object java daki butun class larin parent i gibidir
        object class in parenti yoktur ve parenti olmayan tek class objectir. (hz adem gibi)

         */
        Scanner input=new Scanner(System.in);
        System.out.println("enter an integer");
        int num= input.nextInt();
        Object result=num%2==0?num/2:"this number is not divisible by 2";
        System.out.println(result);
    }
}
