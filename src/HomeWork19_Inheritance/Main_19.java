package HomeWork19_Inheritance;

public class Main_19 {
    public static void main(String[] args){
        BoxWeight nBox = new BoxWeight(10,12,31,44);
        BoxWeight n2Box = new BoxWeight(14);
        nBox.showInfo();
        n2Box.showInfo();
    }
}

/*
Создать класс BoxWeight, который наследуется от Box с доп полем weight;
Создать в ней все конструкторы, как в супер класс, в которых иниц также поле вес;
(Если необходимо, создать геттеры и сеттеры на вес).

В род. классе создать метод showinfo(), который выводит всю инфу о коробке. В дочернем классе переопределить его,
чтобы ещё выводилась инфа о весе.
*/