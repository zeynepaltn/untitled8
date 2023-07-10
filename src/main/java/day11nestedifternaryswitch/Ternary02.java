package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        /*
        kullanicidan bir sayi aliniz o sayi pozitif ise ekrana pozitif
        degil ise ekrana pozitif degil yazdirin
         */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter an integer");
        int num=input.nextInt();
        String result=num>0 ?"pozitif":"pozitif degil";
        System.out.println(result);
    }
}
