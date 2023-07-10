package day18constructorsstatickeyword;

public class Student {
    /*
    1)Static class member lar (variable+method+constructor+code blocks) tum objeler tarafindan paylasilir
    2)Static class member lardaki degisikler tum objeler tarafindan otomatik olarak gorulur
    3)Static class member lar gokteki ayin dunyaya bagli oldugu gibi class'a baglidirlar
    bu yuzden static variable lara class variable da denir
    4)Static class member'larin nasil calistigini anlamak icin cizim yapip static olanlari class a,
    olmayanlari object e baglayarak dusunmek bu konuyu kolaylastirir
    5) Static class memberlari cagirmak icin object olusturmak gerekmez ve tavsiye edilmez
    6) Non-static class member lari cagirmak icin obje olusturmak sarttir

     */
    public static int numOfRegisteredStd=0;
    public int num=0;

    public Student() {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        System.out.println(numOfRegisteredStd);
        System.out.println(s1.num);
    }
}
