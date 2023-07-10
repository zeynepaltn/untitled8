package day12switchLoops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Example 1:Kullanicidan iki sayi ve yapilacak islemi alan ve +,-,/,*,% islemlerini yapan kodu yazin
        Scanner input=new Scanner(System.in);
        System.out.println("please enter two numbers");
        double a=input.nextDouble();
        double b=input.nextDouble();
        System.out.println("yapilacak islemi giriniz. +,-,/,* dan birini seciniz");
        char opr=input.next().charAt(0);// normalde nextInt nextDouble kullanimi char da olmadigi icin charAt(0) kullanildi
        switch(opr){
            case '+':
                System.out.println(a+ "+" +b+"="+(a+b));
                break;
            case '-':
                System.out.println(a+ "-" +b+"="+(a-b));
                break;
            case '/':
                System.out.println(a+ "/" +b+"="+(a/b));
                break;
            case '*':
                System.out.println(a+ "*" +b+"="+(a*b));
                break;
            case '%':
                System.out.println(a+ "%" +b+"="+(a*b/100));
                break;
            default:
                System.out.println("invalid operation");

        }


    }
}
