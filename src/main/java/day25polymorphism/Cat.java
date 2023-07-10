package day25polymorphism;

public class Cat extends Animal{
    @Override
    public void move(){
        System.out.println("Cats move...");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return 2*a*b;
    }

}//class
