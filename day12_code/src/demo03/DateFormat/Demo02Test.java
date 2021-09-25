package demo03.DateFormat;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*计算出生了多少天*/
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入出生日期: yyyy-MM-dd");
        String birthdayDateString =sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdaydate = sdf.parse(birthdayDateString);
        //3.转换为毫秒值
        long birthdayDateTime=birthdaydate.getTime();
        long todayTime =new Date().getTime();
        long time=todayTime-birthdayDateTime;
        System.out.println(time/1000/60/60/24);
    }



}
