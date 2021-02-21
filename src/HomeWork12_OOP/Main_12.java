package HomeWork12_OOP;

public class Main_12 {
    public static void main(String[] args){
        Worker worker = new Worker("Данил","Старший бариста", 60000);
        String inf =worker.salary(10);
        System.out.println(inf);
    }
}


/*
Создать класс Работник с 3-я полями: имя, долэность зп.
Создать конструк класса инициализирующий поля.
Создать метод типа String с параметром месяц(i), возвращающей инфу о сотруднике и зп за i месяцев.
*/