package HomeWork13_OOP_Overload;

public class Monster {
    int Eyes;
    int Lags;
    int Hands;
    Monster(){
        Eyes = 2;
        Lags = 2;
        Hands = 2;
    }
    Monster(int eyes){
        this.Eyes = eyes;
        Lags = 2;
        Hands = 2;
    }
    Monster(int eyes,int hands){
        this.Eyes = eyes;
        this.Hands = hands;
        Lags = 2;
    }
    public Monster(int eyes, int lags, int hands) {
        Eyes = eyes;
        Lags = lags;
        Hands = hands;
    }
    void showMonster(){
        System.out.println("Монстр:"+"\nКол-о глаза: "+Eyes+"\nКол-о рук: "+Hands+"\nКол-о ног:"+Lags);
    }
    static void voice(){
        System.out.println("Голос");
    }
    static void voice(int i){
        String Voice="";
        for (int n=1;n<=i;n++){
            if (n==1) Voice+="Голос,";
            if (n==i) Voice+="голос.";
            else if(n!=0&n<i) Voice+="голос,";
        }
        System.out.println(Voice);
    }
    static void voice(int i, String word){
        String newWord="";
        for(int n=1;n<=i;n++)
            if (n==i) newWord+=word+".";
            else newWord+=word+", ";
        System.out.println(newWord);
    }
}

/*
Создать класс Monster с 3-я полями: шлаза, руки, ноги.
Если в параметрах конструктора не устонавливается какое-либо значение, то стандарт = 2.
Создать конструкторы:
1) Пустой конструктор, уст все параметры = 2.
2) Принимает в качестве параметра кол-о глаз, ост = 2.
3) Принимает кол-о глаз и рук, ноги = 2.
4) Принимает все 3 параметра.
Методы (void):
1) voice() - выводит слово "Голос".
2) voice(int i) - выводит "Голос" i раз.
3) voice(int i, String word) - выводит word i раз.
*/
