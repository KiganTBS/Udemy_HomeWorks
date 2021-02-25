package HomeWork23_Exceptions;

public class Main_23 {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            for (int i = 0; i <= array.length; i+=2)
                array[i] = i;
            for (int i : array)
                System.out.println(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        } finally {
            for (int i : array)
                System.out.println(i);
        }
    }
}
