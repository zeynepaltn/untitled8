package day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
      /*
      kullanicidan 0 dan kucuk 120 den buyuk data giremeyek sekilde data
      aldiktan sonra eger calisan kadinsa 60 yasindan buyukse"emekli olabilir" yadiran
      eger calisan erke ve 65 yasindan buyukse "emekli olabilir" yazdiran kodu girin
       */
        /*
        1) if icinde if kullanirsaniz , "nested if olusturmussunuz demektir"
        2) Nested if javayi yavaslatir bu yuzden mecbur kalmadikca kulllanmayiz
        3) Nested if gibi Java yi uyavaslatan kodlar time consuming olarak adlandirilir
        4)
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("please enter your gender");
        String gender=input.next();
        if(age<0 || age>120){
            System.out.println("age is invalid");
        }else if(gender.equalsIgnoreCase("male")){
            if(age>65){
                System.out.println("Can retire");
            }else{
                System.out.println("should work");
            }

        }else if (gender.equalsIgnoreCase("female")){
            if(age>60){
                System.out.println("can retire");
            }else{
                System.out.println("should work");
            }

        }else{
            System.out.println("unidentified gender");
        }

    }
}
