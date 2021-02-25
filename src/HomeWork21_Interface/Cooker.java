package HomeWork21_Interface;

public class Cooker extends Worker implements Cookable{
    public Cooker(String name) {super(name);}

    @Override
    public void cook() {
        System.out.println("Готовит");
    }
}
