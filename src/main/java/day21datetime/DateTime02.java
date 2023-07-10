package day21datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt); //2023-03-16T19:03:35.990214  "T" time basliyor demek
        //Month icin "MM" kullandigimizda 03-07 gibi verebilir "M" kullanirsak tek habeli verir
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("M/dd/yyyy-hh:mm a");
        String formattedLdt=dtf1.format(ldt);
        System.out.println(formattedLdt);
    }
}
