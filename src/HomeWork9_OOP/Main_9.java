package HomeWork9_OOP;
public class Main_9 {
    public static void main(String[] args) {
        Human hm1 = new Human();
        Human hm2 = new Human();
        Human hm3 = new Human();
        Human hm4 = new Human();
        Human hm5 = new Human();
        hm1.age = 40;
        hm2.age = 30;
        hm3.age = 20;
        hm4.age = 10;
        hm5.age = 5;
        int age = (hm1.age+ hm2.age+hm3.age+ hm4.age+hm5.age)/5;
        System.out.println("Средний возраст людей: "+age);
    }
}
/*
Создать класс ЛЮДИ содержаший 3 поля: имя, возраст и вес.
Создать 5 объектов типа ЛЮДИ и присвоить им возраст.
Вычислить средний возраст людей.
*/