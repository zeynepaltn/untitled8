package day12switchLoops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        /*
        Kullanicidan aldigininz karakterin sesli harf olup olmadigini kontrol eden
        kodu giriniz. sesli harfler a,e,i,o,u
         */
        //toLoverCase char icin calismaz string icin calisir
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter");
        // 1. Method
        char letter = input.next().charAt(0);// tek karakter almak icin kullanicidan bu kodu kullaniriz
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter +" is a vowel");
                break;
            default:
                System.out.println(letter+" is not a vowel");
                //2. Method
                String letter2 = input.next().substring(0, 1).toLowerCase();
                switch (letter2) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                        System.out.println(letter2 +" is a vowel");
                        break;
                    default:
                        System.out.println(letter2+" is not a vowel");
                }
                //3. method
                String letter3 = input.next().substring(0, 1);
                switch (letter3) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                    case "A":
                    case "E":
                    case "I":
                    case "O":
                    case "U":
                        System.out.println(letter3 + " is a vowel");
                        break;
                    default:
                        System.out.println(letter3+" is not a vowel");
                }
        }
    }
}
