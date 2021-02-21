package HomeWorks14_OOP;

public class Box {
    int width;
    int length;
    int height;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    Box (Box box1,Box box2){
        this.height = box1.height + box2.height ;
        this.length = box1.length + box1.length ;
        this.width = box1.width+ box2.width ;
    }
    Box sumBox(Box box) {
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }

    void showBox(){
        System.out.println("Размеры коробки:"+width*length*height);
    }
}

/*
В классе Box создать метод, который принимает в качестве параметра объект box и возвращает новую коробку,
у которой все размеры = размер вызывающего объекта + размеры переданного объекта.

Создать конструктор, который принимает 2-е коробки.
С помощью этого конструктора создается объект, объём которого = сумме 2-х коробок
*/