package demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/*格式化时间*/
public class Demo01DateFormate {
    public static void main(String[] args) throws ParseException {
            demo02();
    }
/*使用parse*/
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=sdf.parse("2021年09月25日 12时12分40秒");
        System.out.println(date);

    }

    /*模式*/
    private static void demo01(){
       // SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=new Date();
        String text=sdf.format(date);
        System.out.println(date);
        System.out.println(text);
    }
}
