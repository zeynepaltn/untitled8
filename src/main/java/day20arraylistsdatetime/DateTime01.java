package day20arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;//util yapiyoruz library den
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        LocalDate myCurrentDate=LocalDate.now(); //Bu sekilde icinde bulundugumuz tarihi aliyoruz
        System.out.println(myCurrentDate);
        int monthValue=myCurrentDate.getMonthValue();
        System.out.println(monthValue);//3 cunku mart 3. ay
        int yearValue=myCurrentDate.getYear();
        System.out.println(yearValue);//2023
        int dayOfMonth=myCurrentDate.getDayOfMonth();
        System.out.println(dayOfMonth);// 15. ayin 15. gunu anlaminda
        //Enum Java da sabit degerleri (mesela ay isimleri,gun isimleri,ulke ve sehir isimleri) depolamak icin kullanilir.
        Month monthName=myCurrentDate.getMonth();
        System.out.println(monthName);
        DayOfWeek dayName=myCurrentDate.getDayOfWeek();
        System.out.println(dayName);
        //Ileri bir tarihe ya da geri bir tarihe nasil gideriz?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));//2027-05-20. ILERI TARIHE GIDERIZ
        System.out.println(myCurrentDate.minusDays(18).minusMonths(2).minusYears(30)); //gecmis tarihe de gidebiliriz
        //Bir tarih bir tarih den once mi sonra mi nasil kontrol ederiz?
        LocalDate gokhanDob=LocalDate.of(1986,6,10);
        LocalDate fatihDob=LocalDate.of(1985,2,25);
        boolean r1=gokhanDob.isAfter(fatihDob);
        System.out.println(r1);
        boolean r2=fatihDob.isBefore(gokhanDob);
        System.out.println(r2);
        boolean r3=gokhanDob.isEqual(fatihDob);
        System.out.println(r3);
        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz"
        //mesaji veriniz.Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year/month/day in numerals");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();
        LocalDate givenDate=LocalDate.of(year,month,day);
        if(givenDate.isBefore(LocalDate.now())){
            System.out.println("invalid date");

        }else{
            System.out.println("enter time for the ticket");
        }
        int lengthOfMonth=myCurrentDate.lengthOfMonth();
        System.out.println(lengthOfMonth);// mart ayinda oldugumuz icin 31 verecek cevabi
        //Example 2: Kullanicinin girdigi arihin gun ismini bulan kodu yazin
        System.out.println("Please enter year/month/day in numerals");
        int y=input.nextInt();
        int m=input.nextInt();
        int d=input.nextInt();
        LocalDate date=LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());

    }//main
}//class
