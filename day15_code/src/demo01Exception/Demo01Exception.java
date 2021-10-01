package demo01Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        /*编译异常*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1999-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("后续代码");


    }
}
