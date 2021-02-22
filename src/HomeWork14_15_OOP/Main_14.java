package HomeWork14_15_OOP;

public class Main_14 {
    public static void main(String[] args){
        Box box1 = new Box(5,5,5);
        Box box2 = new Box(10,10,10);
        box1.showBox();
        box2.showBox();
        Box box3 = box1.sumBox(box2);
        box3.showBox();
        Box box4 = new Box(box1,box2);
        box4.showBox();
    }
}

/*
Задание 14:

В классе Box создать метод, который принимает в качестве параметра объект box и возвращает новую коробку,
у которой все размеры = размер вызывающего объекта + размеры переданного объекта.

Создать конструктор, который принимает 2-е коробки.
С помощью этого конструктора создается объект, объём которого = сумме 2-х коробок

Задание 15:
Сделать все поля private
*/