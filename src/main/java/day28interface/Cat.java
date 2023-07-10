package day28interface;

public class Cat implements Mammal{

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {
        //Interface'lerde variable cagirirken, interface adini kullanrak cagirin. Bu hem
        //static vari olmanin geregdir hem de okunurlulugu artirir
        System.out.println(Animal.age);
        System.out.println(Mammal.feedBaby);
        System.out.println(Mammal.age);
    }
}
