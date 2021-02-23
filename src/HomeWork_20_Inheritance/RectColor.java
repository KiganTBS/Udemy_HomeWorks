package HomeWork_20_Inheritance;

public final class RectColor extends Rect{ //Данный класс является final, соответственно не может иметь под классов.
    String color;
    public RectColor(int a, int b,String color) {
        super(a, b);
        this.color = color;
    }

    @Override
    public double area() {
        System.out.println("Цвет:" +color);
        return super.area();
    }
}
