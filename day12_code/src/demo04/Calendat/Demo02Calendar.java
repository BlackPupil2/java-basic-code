package demo04.Calendat;

import java.util.Calendar;
import java.util.Date;

/*Calendar成员方法*/
public class Demo02Calendar {
    public static void main(String[] args) {
        demo04();
    }

    private static void demo04() {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);

    }

    private static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,2);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int day = c.get(Calendar.DATE);
        System.out.println(day);
    }

    /*设置指定值*/
    private static void demo02() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,9999);
        c.set(Calendar.MONTH,2);
        c.set(Calendar.DATE,22);
        c.set(9999,2,23);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int day = c.get(Calendar.DATE);
        System.out.println(day);
    }

    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
     //   int day = c.get(Calendar.DAY_OF_MONTH);
        int day = c.get(Calendar.DATE);
        System.out.println(day);

    }
}
