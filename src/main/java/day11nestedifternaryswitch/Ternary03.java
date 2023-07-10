package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {
        /*
        type java code by using nested ternary
        write a program to check if a year is a leap year or not.
        if the year is divisible by 100 then it must be divisible by 400.
        if e year is not divisible by 100 then it must be divisible by 4.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a year");
        int year= input.nextInt();
        // FIRST method by using nested ternary
        String result=year%100==0?(year%400==0?"leap year":"not a leap year"):(year%4==0?"leap year":"not a leap yer");
        System.out.println(result);
        //Second method by using if else statements
        if(year%100==0){
            if(year%400==0){
                System.out.println("leap year");
            }else{
                System.out.println("not a leap year");
            }
        }else {
            if(year%4==0){
                System.out.println("leap year");
            }else{
                System.out.println("not a leap year");
            }
        }

    }
}
