package HomeWork17_Parse;

public class Main_17 {
    public static void main(String[] args){
        String man = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист";

        String name = (man.substring(4,8));
        String post = (man.substring(54,65));
        int age =(Integer.parseInt(man.substring(14,16)));
        Double height = (Double.parseDouble(man.substring(32,37)));
        Man nMan = new Man(name,post,age,height);
        System.out.println("Имя: "+nMan.getName());
        System.out.println("Должность: "+nMan.getPost());
        System.out.println("Возраст: "+nMan.getAge());
        System.out.println("Рост: "+nMan.getHeight());

    }
}

/*
Создать класс Man с 4-я private полями: String имя, Stirng должность, Int возраст и Double рост;
Инициализировать их через конструктор.

В Main написать строку: "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист";
С помощью данных из этйо строки создать объект класса Man .

Вывести через get`еры все поля класса Man.
*/
