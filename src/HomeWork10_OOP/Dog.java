package HomeWork10_OOP;

public class Dog {
    String name, breed;
    int speed;
    void run(){
        String runAW="";
        for(int i =0;i<=speed;i++){
            if(i==0) runAW+="Бегу,";
            if(i == speed){ runAW+="бегу.";}
            else runAW+="бегу,";
        }
        System.out.println(runAW);
    }
    String info(){
        return "Кличка: "+name+"\nПорода: "+breed+"\nСкорость: "+speed+" Км/ч";
    }
}
