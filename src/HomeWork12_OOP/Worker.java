package HomeWork12_OOP;

public class Worker {
    String Name;
    String Position;
    int Salary;

    public Worker(String name, String position, int salary) {
        Name = name;
        Position = position;
        Salary = salary;
    }
    String salary(int month){
        String info = "Сотрудник\nИмя: "+Name+"\nДолжность: "+Position+"\nЗарплата: "+Salary+"\nЗарплата за "+month+" месяцев: "+Salary*month;
        return info;
    }
}

/*
Создать класс Работник с 3-я полями: имя, должность и зп.
Создать конструк класса инициализирующий поля.
Создать метод типа String с параметром месяц(i), возвращающей инфу о сотруднике и зп за i месяцев.
*/