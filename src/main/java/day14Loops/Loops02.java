package day14Loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        //3 den 8 e kadar tum tam sayilari konsola yazdiran kodu girin
       //1. method
       for(int i=3;i<9;i++){
           System.out.print(i+" ");
           }
        System.out.println(" ");
        //2. method da while llop kullanacagiz
        //for loop ve while loop tamamen ayni isi yapar
        //for loop while loop a gore daha zor okunur
        int i=3;//while loop da baslangic degeri bu sekilde yazilir
        while(i<9){

            System.out.println(i+" ");
            i++;

       }
        //21 den 180 e kadar hem 4 hem 6 ile bolunbilenleri konsola yazdirin
        //while method ile yaz
        int k=21;
        while(k<181){
            if(k%4==0 && k%6==0){
                System.out.print(k+" ");
            }

            k++;

        }
        System.out.println(" ");


        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
//miami ==> MiAmI
        String s="miami";
        int m=0;
        while(m<s.length()){
            String ch=s.substring(m,m+1);
            if(m%2==0){
                System.out.print(ch.toUpperCase());

            }else{
                System.out.print(ch);
            }
            m++;
        }
        System.out.println(" ");
        //size verilen tamsayinin rakamlari toplamini yazdiran kodu girin
        int r=578;
        int sum=0;
        while(r>0){
            sum=sum+r%10;
            r=r/10; //r++ demeye gerek kalmiyor cunku bolerek azaltma yapiyoruz

        }
        System.out.println(sum);
        //kullanicidan aliginiz sayi icin carpim tablosu olusturan kodu yazin
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        double n= input.nextDouble();
        int u=1;
        while(u<11){
            System.out.println(n+"x"+u+"="+(n*u));
            u++;
        }
        //Kullanicidan aldiginiz string deki sessiz harfleri yazdiran kodu girin
        System.out.println("Please enter a word");
        String y=input.next();
        int z=0;
        while(z<y.length()){

            char ch=y.charAt(z);
            boolean x= ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
            if(!x){ //eger x degilse yazdir diyoruz
                System.out.print(ch+" ");
            }

            z++;
        }

    }
}
