package day18constructorsstatickeyword;

public class StudentRunner {
    public static void main(String[] args) {
        System.out.println(Student.numOfRegisteredStd); //Static olanlar class ismiyle cagrilir
        Student s1=new Student(); // static olmayanlar ise object create yapilarak cagrilir
        System.out.println(s1.num);
        //static olan "numOfRegisteredStd" variabl'ina object uzerinden ulasabilrsiniz ama bu hatadir
        System.out.println(s1.numOfRegisteredStd);

    }

}
