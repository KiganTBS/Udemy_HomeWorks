package HomeWork22_Interface;

public class Main_22 {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new CounterBuh() {
            @Override
            public String report(int month) {
                if (month == 1)
                    return "Отчёт за " + month + " месяц";
                else if (month <= 4 & month > 1) return "Отчёт за " + month + " месяца";
                else return "Отчёт за " + month + " месяцев";
            }
        }, 1);
        MyCounter counter = new MyCounter();
        director.force(counter, 12);
        director.force(counter, 3);

    }
}
/*
Создать интерфейс Counter, содержащий метод, который возаращает отчёт в виде строки, а в качестве параметра принимает кол-о месяцев, за которые этот отчёт был сделан.

Создать класс Director, содержащий метод, который принимает в качестве параметров интерфейс и переменную, которая хранит кол-о месяцев;
В этом методе мы должны получить отчёт и вывести его на экран.

Реализовать выполнения метода force 2-я способами:
1) Использование анонимного метода.
2) Создание объекта реализующего метода и передача его в качестве параметра.
*/