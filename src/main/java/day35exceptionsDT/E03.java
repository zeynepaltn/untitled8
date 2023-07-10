package day35exceptionsDT;

import com.sun.tools.attach.AgentInitializationException;

public class E03 {
    public static void main(String[] args) {
       String s="Java";
       getCharFromString(s,2);
       getCharFromString(s,4);

    }
    public static void getCharFromString(String s,int idx){

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("olmayan index kullandiniz ="+e.getMessage());
            System.out.println(e.getCause());//null
            //e.printStackTrace(); detaylari hata neredeydi gosterir
        }


    }
}
