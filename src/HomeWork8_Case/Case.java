import java.util.Scanner;
public class Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Выбор задания
        Scanner in2 = new Scanner(System.in); //Ввод String
        System.out.println(
                "Выберите задание: \n" +
                        "1 - Название месяца по номеру \n" +
                        "2 - Время года(if/else)\n" +
                        "3 - Время года(switch case)"
        );
        int task = in.nextInt();
        switch (task) {
            case(1): {
                System.out.println("Введите номер месяца");
                int numMon = in.nextInt();
                switch (numMon) {
                    case (1):
                        System.out.println("January");
                        break;
                    case (2):
                        System.out.println("February");
                        break;
                    case (3):
                        System.out.println("March");
                        break;
                    case (4):
                        System.out.println("April");
                        break;
                    case (5):
                        System.out.println("May");
                        break;
                    case (6):
                        System.out.println("June");
                        break;
                    case (7):
                        System.out.println("July");
                        break;
                    case (8):
                        System.out.println("August");
                        break;
                    case (9):
                        System.out.println("September");
                        break;
                    case (10):
                        System.out.println("October");
                        break;
                    case (11):
                        System.out.println("November");
                        break;
                    case (12):
                        System.out.println("December");
                        break;
                    default:
                        System.out.println("Месяц не существует");
                        break;
                }
                break;
            }
            case(2):{
                System.out.println("Введите название месяца (Английский)");
                String nameMon = in2.nextLine();
                if (nameMon.equals("January")|nameMon.equals("February")|nameMon.equals("December")) {System.out.println("Зима");}
                else if (nameMon.equals("March")|nameMon.equals("April")|nameMon.equals("May")) {System.out.println("Весна");}
                else if (nameMon.equals("June")|nameMon.equals("July")|nameMon.equals("August")) {System.out.println("Лето");}
                else if (nameMon.equals("September")|nameMon.equals("October")|nameMon.equals("November")) {System.out.println("Осень");}
                else System.out.println("Месяц не существует");
                break;
            }
            case(3):{
                System.out.println("Введите название месяца (Английский)");
                String nameMon = in2.nextLine();
                switch (nameMon){
                    case "January":
                    case "February":
                    case "December":
                        System.out.println("Зима");
                        break;
                    case "March":
                    case "April":
                    case "May":
                        System.out.println("Весна");
                        break;
                    case "June":
                    case "July":
                    case "August":
                        System.out.println("Лето");
                        break;
                    case "September":
                    case "October":
                    case "November":
                        System.out.println("Осень");
                        break;
                    default:
                        System.out.println("Месяца не существует");
                        break;
                }
            }
        }
    }
}
/*
1
(Использовать оператор условия, НЕ МАССИВ!)
Написать программу, которая принимает номер месяца и выводит его на экран.
Если месяц не существует, выводится надпись "Месяц не существует".

2
(If else)
Написать программу, которая принимает название месяца и вывод время года.

3
(Switch case)
Написать программу, которая принимает название месяца и вывод время года.
*/