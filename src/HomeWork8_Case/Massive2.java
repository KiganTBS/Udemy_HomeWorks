public class Massive2 {
    public static void main(String[] args){
        String[] month = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        String res = "";
        for(int i =0;i<month.length;i++){
            res+=month[i];
            if (i == month.length-1){
                res+=".";
            }
            else res+=", ";
        }
        System.out.print(res);
    }
}
/*
Вывести массив содержащий через запятую месяцы года и в конце поставить точку
*/