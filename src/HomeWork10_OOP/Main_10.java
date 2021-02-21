package HomeWork10_OOP;

public class Main_10 {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Барбос";
        dog1.breed = "Сиба ину";
        dog1.speed = 10;
        dog2.name = "Мухтар";
        dog2.breed = "Овчарка";
        dog2.speed = 20;
        System.out.println(dog1.info());
        dog1.run();
        System.out.println(dog2.info());
        dog2.run();
    }
}

/*
Создать класс Dog, содержащий 3 поля: кличка и порода (String), и скорость (int).
Создать внутри класса 2 метода:
1) Run(без параметров) - ВЫВОДИТ на экран строку "Беги". Количество "Беги" = скорости.
2) info() - ВОЗВРАЩАЕТ строку с инфой о собаке.
*/