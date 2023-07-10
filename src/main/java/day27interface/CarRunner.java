package day27interface;

public class CarRunner {
    public static void main(String[] args) {
        Engine.stop(); //madde 11. engine. yazinca stop methodu geldi
        //Interface den obje olusturamayiz
        Honda h=new Honda();
        h.echo(); //echo methodu static olmadigindan (default) object create yapip ulastik


    }//main
}//class
