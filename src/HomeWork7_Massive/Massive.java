public class Massive {
    public static void main(String[] args){
        int[] mass1 = new int[901];
        int[] mass2 = new int[mass1.length];
        for (int i=0;i< mass1.length;i++){
            mass1[i] = i+100;
        }
        for (int i = 0,j=mass1.length-1;i< mass1.length;i++,j--){
            mass2[i] = mass1[j];
        }
        for (int j : mass2){
            System.out.println(j);
        }
    }
}
/*
Создать массив чисел, и проинициализировать его значениями от 100 до 1000.
ССоздать второй массив по длинне равный первому.
Проинициализировать его значениями, взятыми из первого масссива, но в обратном порядке.
Вывести все элементы второго массива через цикл for each.
*/