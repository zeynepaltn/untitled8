package day24inheritencepolymorphism;

public class Honda extends Car{
    public void eco(){
        System.out.println("Honda engines are so economic...");
    }
    public String model="Civic";
    public int price=20000;
    public Honda(){
        System.out.println(this.model);
        System.out.println(super.model);

    }

}
