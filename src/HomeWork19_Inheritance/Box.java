package HomeWork19_Inheritance;

public class Box {
    private int width;
    private int length;
    private int height;

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getLength() {
        return length;
    }

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Box() {
        this.width = 0;
        this.length = 0;
        this.height = 0;
    }

    public Box (Box box1, Box box2){
        this.height = box1.height + box2.height ;
        this.length = box1.length + box1.length ;
        this.width = box1.width+ box2.width ;
    }
    public Box sumBox(Box box) {
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }
    public void showInfo() {
        System.out.println("Ширина: "+width+"\nДлинна: "+length+"\nВысота: "+height);
    }
    public void showBox(){
        System.out.println("Размеры коробки:"+width*length*height);
    }
}


/*
Создать класс BoxWeight, который наследуется от Box с доп полем weight;
Создать в ней все конструкторы, как в супер класс, в которых иниц также поле вес;
(Если необходимо, создать геттеры и сеттеры на вес).

В род. классе создать метод showinfo(), который выводит всю инфу о коробке. В дочернем классе переопределить его,
чтобы ещё выводилась инфа о весе.
*/