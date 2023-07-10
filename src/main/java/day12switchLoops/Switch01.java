package day12switchLoops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //1 den 12 ye kadar herganhi bir sayi yazinca o sayinin denk geldigi ayi ve sonrasini yazdiran kod
        /*
        switch parantezi icinde string, int,byte,short,char kullanilabilir
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen baslamak istediginiz ayin numarasini girin");
        int num= input.nextInt();
        switch(num){
            case 1:
                System.out.println("january");
            case 2:
                System.out.println("february");
            case 3:
                System.out.println("march");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("october");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
                break;
            default :
                System.out.println("gecerli ay numarasi veriniz");
        }
        //Note: "switch()" condition parantezi icerisinde 1)string 2)byte 3)int 4)char 5)byte kullanilabilir
        //Note: switch() parantezinde long boolean float double KULLANILMAZ
    }
}
