package HomeWork21_0_Interface;

public class Main_21_0 {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // UpcCast
        CanRun canRun = dog1;
        // canRun.eat Недоступен, т.к CanRun не содержит этот метод
        dog1 = (Dog) canRun; // Используем DownCast, чтобы dog1 мог использовать метод eat
        dog1.eat();
        dog1.run();
        Flyable flyable = new Bird();
        flyable.fly();
    }

}
