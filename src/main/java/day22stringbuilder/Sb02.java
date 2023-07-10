package day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);
        sb1.reverse();//Loop ile de yapilabilir ve interview de gelebilir loop ile ilgili olan
        System.out.println(sb1);
        sb1.deleteCharAt(5);// verilen karakterdeki index i siler
        System.out.println(sb1);
        sb1.delete(4,7);
        System.out.println(sb1);
        sb1.replace(2,5,"X");
        System.out.println(sb1);
        sb1.insert(3,"2023");
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Java");
        int r1=sb2.compareTo(sb3);
        System.out.println(r1);//0 yani alfabetik olarak ayni siradalar
        //-3 ciksaydi sb2 onde demektir,3 ciksaydi sb2 geride demekti
        //StringBuilder nasil String e cevrilir?
        String str=sb1.toString().toUpperCase();
        System.out.println(str);
        //String nasil StringBuilder a cevrilir?
        StringBuilder newSb1=new StringBuilder(str);
        System.out.println(newSb1);
    }
}
