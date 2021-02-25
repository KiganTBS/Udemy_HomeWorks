package HomeWork18_Collection;

import java.util.ArrayList;

public class Main_18 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> nArray = new ArrayList<>();
        for (int i = 1;i<=10;i++)
            num.add(i);
        str.add("Semen");
        str.add("Peter");
        str.add("Vasya");
        str.add("Lesha");
        str.add("Danil");
        str.add("Masha");
        str.add("Yla");
        str.add("Ira");
        str.add("Vika");
        str.add("Kristina");

        for (int i = 0; i < num.size(); i++) {
            String s = num.get(i) + " - " + str.get(i);
            nArray.add(s);
        }
        for (String n : nArray)
            System.out.println(n);
    }
}

/*
Создать 3 коллекции: в первой 10 чисел, во второй 10 имен, а третья должна автоматически заполняться строками,
 которые содержать число из первой коллекции;
Потом знак тире и строку из второй коллекции.

Вывести все значения третьей коллекции в цикле for each.

*/