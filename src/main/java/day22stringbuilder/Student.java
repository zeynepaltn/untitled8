package day22stringbuilder;

public class Student {
    //Student name public oldugu icin, diger class lardan ulasilabilir
    public String stdName="Ali Can";
    int age=23;
    //Access Modifier'i default olan ile public olan class memberlar ayni package icinde
    // kullanildiklarinda ayni ozellikleri gosterirler. Farkli package'e gectiginizde public
    //olanlara ulasilir ama default olanlara ulasilamaz.
    private String healthCondition="Cancer";
    //Private oldugu icin sadece bu class icerisinde gorunur
    //Access modifier i protected olan class member ayni package icerisinde public gibi davranirlar
    //Farkli package'a gectiginizde protected olanlar sadece "child class "
    //lardan gorunebilirler
    protected int salary=3000;
    //NOTE: Class'lar public ve default olabilir ama private ve protected olamazlar


}//class
