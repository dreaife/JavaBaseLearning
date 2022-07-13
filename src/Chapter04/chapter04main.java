package Chapter04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class chapter04main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        double a = 1.0;
        Double.toString(a);
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today-1);     //当月第一天
        DayOfWeek week = date.getDayOfWeek();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i=0;i<week.getValue();i++) System.out.printf("   ");
        while (date.getMonthValue() == month){
            int now = date.getDayOfMonth();
            System.out.printf("%3d",now);                 //输出日期
            if(now == today) System.out.printf("*");
            else System.out.printf(" ");
            date = date.plusDays(1);            //下一天
            if(date.getDayOfWeek().getValue() == 1) System.out.println();
        }
    }
}
