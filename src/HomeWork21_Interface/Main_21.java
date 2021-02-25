package HomeWork21_Interface;

import java.util.ArrayList;

public class Main_21 {
    public static void main(String[] args) {
        Programmer prog = new Programmer("Данил");
        Programmer prog1 = new Programmer("Вася");
        Programmer prog2 = new Programmer("Петя");
        Cooker cook = new Cooker("Маша");
        Cooker cook1 = new Cooker("Вика");
        Cooker cook2 = new Cooker("Юля");
        Driver drive = new Driver("Паша");
        Driver drive1 = new Driver("Рома");
        Driver drive2 = new Driver("Миша");

        ArrayList<Worker> workers= new ArrayList<>();
        workers.add(prog);
        workers.add(prog1);
        workers.add(prog2);
        workers.add(cook);
        workers.add(cook1);
        workers.add(cook2);
        workers.add(drive);
        workers.add(drive1);
        workers.add(drive2);
        for (Worker work:workers)
            work.voice();

        ArrayList<CodeWritable> doprog = new ArrayList<>();
        doprog.add(prog);
        doprog.add(prog1);
        doprog.add(prog2);
        for(CodeWritable code: doprog)
            code.writeCode();

        ArrayList<Cookable> cookables = new ArrayList<>();
        cookables.add(cook);
        cookables.add(cook1);
        cookables.add(cook2);
        for (Cookable cooking: cookables)
            cooking.cook();

        ArrayList<Drivable> drivables = new ArrayList<>();
        drivables.add(drive);
        drivables.add(drive1);
        drivables.add(drive2);
        for (Drivable drivig: drivables)
            drivig.drive();
     }
}

/*
Создать класс Работник, с 1 полем name, конструктором, инициализирующем поле, геттер на поле и метод voice,
в котором выводится имя сотрудника.

Создать 3 класса: Программист, Водитель, Повар, которые наследуют класс Работник;
Их конструкторы также должны принимать только поле name.

Создать 3 интерфейса: Способный программировать, способный водить, способный готовить;
В них создать методы: писать код, готовить, водить.

Каждый работник должен реализовать соответственный интерфейс.

В Main создать по 3 рабоника каждой специальности, в цикле произвести перекличку.
А затем, заставить всех работать:).
*/