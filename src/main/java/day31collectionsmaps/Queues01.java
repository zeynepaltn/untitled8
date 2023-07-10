package day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;


public class Queues01 {
    public static void main(String[] args) {
        Queue<String> wareHouse=new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);
        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese] ilk eleman silindi
        System.out.println(wareHouse.peek());//Meat
        System.out.println(wareHouse);//Ilk elemani sadece yazdirir ama silmez
        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]
        // peek ve element ayni ama peek bos olursa null verir element hata verir
        System.out.println(wareHouse.poll());//Meat ilk elemani verir ve siler
        System.out.println(wareHouse);//[Bread, Egg, Cheese]
        wareHouse.clear();
        System.out.println(wareHouse.poll()); //null verir
        System.out.println(wareHouse.remove());// exception yani hata verir

    }
}
