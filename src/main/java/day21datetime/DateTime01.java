package day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);
        //Anlik zaman da bilesenler nasil alinir?
       int hour= myCurrentTime.getHour();
        System.out.println(hour);
        int min=myCurrentTime.getMinute();
        System.out.println(min);
        int second=myCurrentTime.getSecond();
        System.out.println(second);
        int nano=myCurrentTime.getNano();
        System.out.println(nano);
        //gelecek ve gecmis zamana nasil gidilir?
        LocalTime next=myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);
        //Zaman formati nasil degistirilir?
        //"HH" 24'luk saat formatini, "hh" 12'lik saat formatini kullanir
        // mm nin yanina yazdigimiz a saate gore ya am ya da pm yazdirir
        //"ss" saniyeyi "mm" minute u gosterir. "MM" month demektir
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm a");
        String formattedMyCurrentTime=dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);
        //date Formati nasil degistirilir?
        LocalDate myCurrentDate=LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);
        //Tarihi ay/gun/yil sekline ceviriniz
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentdate=dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentdate);
        //tarihi gun/ay isminin ilk 3 harfi/yil seklinde yaziniz
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2=dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2); //25/Aug/22 verecek
        //Tarihi gun/ay ismi/yil sekline ceviriniz
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3=dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);//25/August/2022
        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
        //Tokyo'da tarih
        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-17
        LocalDate dateInTashkent=LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);
        //Tokyo'da saat?
        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);
        //Koln de saat kac?
        LocalTime timeInBerlin=LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);


    }
}
