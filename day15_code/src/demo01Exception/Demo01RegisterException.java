package demo01Exception;

import java.util.Scanner;

public class Demo01RegisterException {
    static String[] usernames={"张三","李四"};

    public static void main(String[] args) /*throws RegisterException*/ {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入注册的用户名");
        String username=sc.next();
        checkUsername(username);

    }
    public static void checkUsername(String username) /*throws RegisterException*/ {
        for (String name : usernames) {
            if(name.equals(username)){
               try{ throw new RegisterException("该用户已被注册");
               }catch (RegisterException e){
                   e.printStackTrace();
                   return;
               }

            }
        }
        System.out.println("恭喜你注册成功");
    }
}
