package HomeWork_20_Inheritance;

public class Triangle extends Figure{
    private int c;
    public Triangle(int a, int b,int c) {
        super(a, b);
        this.c = c;
    }
    public Triangle(int size) {
        super(size,size);
        this.c = size;
    }

    @Override
    public double area() {
        double p = (getA()+getB()+c)/2;
        return Math.sqrt(p*(p-getA())*(p-getB())*(p-c));
    }
}
