package HomeWork22_Interface;

public class MyCounter implements CounterBuh{
    @Override
    public String report(int month) {
        if (month==1)
            return "Отчёт за " + month + " месяц";
        else if (month<=4&month>1) return "Отчёт за " + month + " месяца";
        else return "Отчёт за " + month + " месяцев";
    }
}
