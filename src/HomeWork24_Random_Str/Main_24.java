package HomeWork24_Random_Str;

public class Main_24 {
    public static void main(String[] args) {
        int i=0;
        for (;;) {
            System.out.println(String.format("Случайное число %s. Попробуйте ещё раз",(int)(Math.random() * 91+10)));
            i++;
            if (i>100) return;
        }
    }
}

/*
Необходимо через String.format вывести все числа в диапозоне от 10 до 100.
*/