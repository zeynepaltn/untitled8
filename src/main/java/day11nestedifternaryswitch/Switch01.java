package day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {
    /*
    Gun isimlerini kullanicidan aliniz ve
    o gunun kacinci gun oldugunu ekrana yazdiriniz
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a day of the week");
        String dayName= input.next();
        // 1. method if else statement
        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println("sunday is the first day of the week");
        }else if(dayName.equalsIgnoreCase("monday")){
            System.out.println("monday is the second day of the week");
        }else if(dayName.equalsIgnoreCase("tuesday")){
            System.out.println("third day of the week");
        } else if (dayName.equalsIgnoreCase("wednesdy")) {
            System.out.println("fourth day of the week");
        } else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println("fifth day of the week");
        } else if (dayName.equalsIgnoreCase("friday")) {
            System.out.println("sixth day of the week");
        }else if(dayName.equalsIgnoreCase("saturday")){
            System.out.println("seventh day of the week");
        }else{
            System.out.println("invalid day name");
        }
        // second method by using switch
        switch(dayName.toLowerCase()){
            case"sunday":
                System.out.println("sunday is the first day");
                break;
            case "monday":
                System.out.println("monday is the second day");
                break;
            case "tuesday":
                System.out.println("tuesday is the third day");
                break;
            case "wednesday":
                System.out.println("wednesday is the third day");
                break;
            case "thursday":
                System.out.println("thursday is the fifth day");
                break;
            case"friday":
                System.out.println("friday is the sixth day");
                break;
            case "saturday":
                System.out.println("saturday is the seventh day");
                break;
            default: //else ile ayni isi yapar
                System.out.println("invalid day name");
                // default dan sonra break denmesine gerek yok cunku default en son basamak

        }
    }
}
