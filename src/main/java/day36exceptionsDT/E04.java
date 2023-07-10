package day36exceptionsDT;

public class E04 {
    /*
    throw keyword bir method body'si cinde istedigimiz yerde, istedigimiz kosullar icin, istedigimiz kadar
    exception atmamizi saglar.
    throw keyword'u yazildiktan sonra bir exception class object'i olusturulur.
    EXception class constructor'inin parantez icinde istedigimiz Exception  mesajini yazabiliriz.
    **try-catch ile exception handle ediyorum, ama throw ile stop execution yapiyorum yani programin calismasini
    durduruyorum ve developar'in buraya dikkatini cekiyorum.
     */
    public static void main(String[] args) {

        printAge(7);
    }//main
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");//burada excp'i ben firlattim bu kod ile
        }else if(age>150){
            throw new IllegalArgumentException("Age cannot be more than 150");
        } else{
            System.out.println(age);
        }

    }
}//class
