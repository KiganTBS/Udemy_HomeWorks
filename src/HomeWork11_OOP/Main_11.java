package HomeWork11_OOP;
import java.util.Scanner;
public class Main_11 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        Rect rect = new Rect();

        System.out.println("Введите длинну прямоугольника:");
        int lenght = in.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        int width = in.nextInt();

        rect.setP(lenght,width);
        System.out.println("Периметр: "+rect.perimeter());
        System.out.println("Площадь: "+rect.area());
    }
}
/*
Создать класс Rect с 2-я полями: длинна и ширина.
Объявить 3 метода:
1) Принимает и устанавливает параметры.
2) Возвращает периметр прямоугольника.
3) Возвращает площадь прямоугольника.
*/