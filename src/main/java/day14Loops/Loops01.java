package day14Loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        //Example:Verilen bir tam sayinin tekrarsiz rakamlarinin toplamini bulunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        String s = input.next();//Data type is string as indexof and lastindexof methods only works with strings


        int sum = 0;


        for (int i=0; i<s.length(); i++){
            String d = s.substring(i, i+1);

            if (s.indexOf(d) == s.lastIndexOf(d)){

                sum = sum + Integer.valueOf(d);

            }

        }
        System.out.println(sum);
        //bir stringdeki tekrarli karakterleri ekrana yazdiran kodu yazin
        //Alabala==>la
        String t="Alala";
        String result="";
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if((t.indexOf(ch)!=t.lastIndexOf(ch))&& !result.contains(""+ch)){
                result=result+ch;

            }

        }
        System.out.println(result);
    }
}
