package day14Loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        //while loop
        int i=1;
        while(i<1){//while loop da loop body nin hic calismamasi mumkundur(zero execution is possible)
            System.out.println("while loop");
            i++;
        }
        //do-while loop
        int k=1;
        do{
            System.out.println("do-while loop");
            k++;
        }while(k<1);
        //Kullnici bir sayi girsin, sayi 100 den kucukse kullanici kazandiniz mesaji alsin
        //diger durumlarda kaybettiniz mesaji alsin
        Scanner input=new Scanner(System.in);
        /*
        do-while loop da loop bodysi en az bir kere calisir
         */

        do{
            System.out.println("enter a number");
            int num= input.nextInt();
            if(num<100){
                System.out.println("you won");

            }else{
                System.out.println("you lost");
                break;
            }
        }while(true);
        //kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yazin
        //Kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz

        do{

            System.out.println("Please enter a word");
            String s = input.next();

            if(s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is grammatically correct");
            }else{
                System.out.println("Your sentence has grammatical mistake");
                break;
            }

        }while(true);


    }
}
