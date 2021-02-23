package HomeWork17_Parse;

public class Man {
    private String Name;
    private String Post;
    private int Age;
    private double Height;

    public Man(String name, String post, int age, double height) {
        Name = name;
        Post = post;
        Age = age;
        Height = height;
    }

    public String getName() {return Name;}
    public String getPost() {return Post;}
    public int getAge() {return Age;}
    public double getHeight() {return Height;}
}

/*
Создать класс Man с 4-я private полями: String имя, Stirng должность, Int возраст и Double рост;
Инициализировать их через конструктор.

В Main написать строку: "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист";
С помощью данных из этйо строки создать объект класса Man .

Вывести через get`еры все поля класса Man.
*/