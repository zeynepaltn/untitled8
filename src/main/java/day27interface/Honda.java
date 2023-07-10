package day27interface;

public class Honda  implements Engine,Brake{
    @Override
    public void start() {
        System.out.println("Start...");
    }

    @Override
    public void payment() {
        System.out.println("pay the break");
        System.out.println("pay the engine");
    }

    @Override
    public void slow() {
        System.out.println("Be slow...");

    }
}
