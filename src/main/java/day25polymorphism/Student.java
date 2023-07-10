package day25polymorphism;

public class Student {
    public String stdName="Tom Hanks";
    public int age=23;
    //Encapsulation: data saklamaktir (Data hiding). Data'yi saklamak icin acces modifier'i
    //"private" yapariz.
    private String stdId="AC2023102T";
    private double gpa=3.87;
    private boolean successful=false;
    //Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz
    //Nasil okuruz? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.
    //i)get method'lar hep "public" olur. ii) get method'un "return type"i okudugu variable'in return type'i ile ayni olur.
    //iii)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar.

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }
    /*
    Get methodlari hep public olur. Get methodunun return type'i okudugu variable'in return type'i ile ayni olur.
    Get method bir boolean variable icin olusturlduysa ismi is ile baslar.
    Set methodlar hep public olur.
    Get methodlarin return type'i hep void olur.
    Set methodu parametre kullanir ve parametrenin data type'i variable ile ayni olur.
    set method kullanarak varolan object uzerinde degisikler yaparak o objecti sanki yeni
     objectmis gibi kullanabiliriz.
     get method larin diger adi getter, set method larin diger adi setter dir
     */

    //Encapsulation yapilan variable'in data typ i boolean ise get method "is" ile baslar
    public boolean isSuccessful() {
        return successful;
    }
    //Encapsulation yaptigimiz data'yi istersek diger class'lardan
    //degistirebiliriz. "set method" olusturarak encapsulated yapilmi data degistirilebilir



    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
