package day24inheritencepolymorphism;

public class Volvo extends Car{
    public void secure(){
        System.out.println("Volvo is the most secure car in the world...");
    }

    @Override //bu bir annotation'dir
    //@override annotation'i override kurallarini kontrol eder
    public void move() {
        super.move();
        System.out.println("Volvo moves");
    }
}
