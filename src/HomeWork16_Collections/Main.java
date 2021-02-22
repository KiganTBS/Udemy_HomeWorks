package HomeWork16_Collections;

public class Main {
    public static void main(String[] args) {
        MyCollections emp = new MyCollections();
        for (int i = 1; i <= 100; i++) {
            emp.add("Кица " + i);
        }
        emp.add("Not caca");
        emp.remove("кИЦа 100");
    for (int i=0;i<emp.getSize();i++){
        System.out.println(emp.getArray(i));
    }
        System.out.println(emp.getSize());
    }
}
