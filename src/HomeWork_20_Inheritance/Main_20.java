package HomeWork_20_Inheritance;

public class Main_20 {
    public static void main(String[] args){
        Rect rect = new Rect(5,10);
        Rect rect1 = new Rect(4);
        System.out.println(rect.area());
        System.out.println(rect1.area());

        Triangle triangle = new Triangle(3,4,5);
        Triangle triangle1 = new Triangle(10);
        System.out.println(triangle.area());
        System.out.println(triangle1.area());

        RectColor rectColor = new RectColor(5,6,"Green");
        System.out.println(rectColor.area());
    }
}
