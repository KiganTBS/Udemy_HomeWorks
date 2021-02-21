package HomeWork13_OOP_Overload;

public class Main_13 {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        Monster monster2 = new Monster(10);
        Monster monster3 = new Monster(3, 4);
        Monster monster4 = new Monster(12, 8, 8);

        monster1.showMonster();
        monster2.showMonster();
        monster3.showMonster();
        monster4.showMonster();

        Monster.voice();
        Monster.voice(3);
        Monster.voice(2, "2 Кицы");
    }
}

/*
Создать класс Monster с 3-я полями: шлаза, руки, ноги.
Если в параметрах конструктора не устонавливается какое-либо значение, то стандарт = 2.
Создать конструкторы:
1) Пустой конструктор, уст все параметры = 2.
2) Принимает в качестве параметра кол-о глаз, ост = 2.
3) Принимает кол-о глаз и рук, ноги = 2.
4) Принимает все 3 параметра.
Методы (void):
1) voice() - выводит слово "Голос".
2) voice(int i) - выводит "Голос" i раз.
3) voice(int i, String word) - выводит word i раз.
*/