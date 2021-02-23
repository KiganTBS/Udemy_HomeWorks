package HomeWork_20_Inheritance;

public abstract class Figure { // Данный класс является абстрактным, соответсвенно вызвать объект - нельзя
    private int a;
    private int b;

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract double area(); // Данный метод - абстрактный, соответственно, его нужно будет переопределить в под классах

    public final int getA() {return a;} // Данные методы являются final
    public final int getB() {return b;} // Соответственно, переопределить их нельзя
}
