package HomeWork19_Inheritance;

public class BoxWeight extends Box {
    private int weight;

    public BoxWeight(int width, int length, int height, int weight) {
        super(width, length, height);
        this.weight = weight;
    }

    public BoxWeight(int weight) {
        super();
        this.weight = weight;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Вес: "+weight);
    }
}

/*
Создать класс BoxWeight, который наследуется от Box с доп полем weight;
Создать в ней все конструкторы, как в супер класс, в которых иниц также поле вес;
(Если необходимо, создать геттеры и сеттеры на вес).

В род. классе создать метод showinfo(), который выводит всю инфу о коробке. В дочернем классе переопределить его,
чтобы ещё выводилась инфа о весе.
*/