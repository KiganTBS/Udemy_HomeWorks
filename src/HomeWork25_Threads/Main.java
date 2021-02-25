package HomeWork25_Threads;

public class Main {

    static Boolean Stop = false;

    public static void main(String[] args) {
        int rand = (int) (Math.random() * 1000000);
        System.out.println(rand);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!Stop) {
                        i++;
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {}}});

        Thread randNum = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Stop) {
                    int currentNum = (int) (Math.random()*100000000);
                    if (currentNum==rand){
                        Stop = true;
                        System.out.println(currentNum);
                    }
                }
            }
        });
        timer.start();
        randNum.start();
    }
}
