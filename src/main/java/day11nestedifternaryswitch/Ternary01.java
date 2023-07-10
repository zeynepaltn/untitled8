package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    /*
    kullanican alinan iki sayinin kucuk olanini ekrana yazdirin
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter two integers");
        int first= input.nextInt();
        int second= input.nextInt();
        //1. method
        if(first<second){
            System.out.println(first);
        }else{
            System.out.println(second);
        }
        //2. method by using ternary
      int result= first<second ? first:second;
        System.out.println(result);

    }

}
